import java.io.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.*;

public class Arvutiparandus {

    private static Arvuti loeArvuti(String töö) throws FormaadiErind {
        String koopia = töö;
        String tootja;
        boolean onKiirtöö=false;
        LocalDateTime registreerimisAeg = LocalDateTime.now();

        if (töö.contains("@")){
            String[] osad = töö.split("@");
            registreerimisAeg = LocalDateTime.parse(osad[1]);
            töö = osad[0];
        }
        String[] osad = töö.split(";");
        if (osad.length < 2||osad.length>3){
            throw new FormaadiErind("semikoolonitega eraldatud väljade arv on väiksem, kui kaks, või suurem, kui kolm");
        }
        tootja = osad[0];
        if (!osad[1].matches("tavatöö")&&!osad[1].matches("kiirtöö")){
            throw new FormaadiErind("töötüüp ei ole \"tavatöö\" ega \"kiirtöö\"");
        }

        if (osad[1].equals("kiirtöö")) onKiirtöö = true;

        if (osad.length == 3){
            String monitoriga = osad[2];
            if (!monitoriga.equals("monitoriga"))
                throw new FormaadiErind("väljade arv on kolm, aga kolmanda välja väärtus ei ole \"monitoriga\"");
            return new VäliseMonitorigaArvuti(tootja, onKiirtöö, registreerimisAeg, koopia);
        }
        return new Arvuti(tootja, onKiirtöö, registreerimisAeg, koopia);
    }

    public static void main(String[] args) throws IOException, FormaadiErind {
        kirjutaNaidis();

        // loe andmed failist

        String failinimi = args[0];
        List<Arvuti> kiirtööd = new ArrayList<>();
        List<Arvuti> tavatööd = new ArrayList<>();
        double rahaKokku = 0;

        Map<String, Double> tunintasud = new HashMap<>();


        //Loome esialgsed tööd
        InputStream s = null;
        if (failinimi.startsWith("http://")||failinimi.startsWith("https://")){
            s = new URL(failinimi).openStream();
        }
        else
            s = new FileInputStream(failinimi);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(s, StandardCharsets.UTF_8))){
            String rida = br.readLine();
            while (rida!=null){
                try {
                    Arvuti uus = loeArvuti(rida);
                    if (uus.onKiirtöö()) kiirtööd.add(uus);
                    else tavatööd.add(uus);
                } catch(FormaadiErind erind){
                    System.out.println("Rida: "+rida+", veaselgitus: "+erind.getMessage());
                }
                rida = br.readLine();
            }
        }

        System.out.println(kiirtööd);
        System.out.println(tavatööd);


        //loeme tunnitasud
        try(DataInputStream dis = new DataInputStream(new FileInputStream("tunnitasud.dat"))){
            int inimesi = dis.readInt();

            for (int i = 0; i < inimesi; i++) {
                tunintasud.put(dis.readUTF(),dis.readDouble());
            }
        } catch (Exception e) {

        }


        Scanner lugeja = new Scanner(System.in);
        while (true) {
            System.out.print("Kas soovid parandada (P), uut tööd registreerida (R) või lõpetada (L) ? ");
            String sisend = lugeja.nextLine();
            if (sisend.equals("P")){
                Arvuti parandatav;
                if (!kiirtööd.isEmpty()) parandatav = kiirtööd.remove(0);
                else if (!tavatööd.isEmpty()) parandatav = tavatööd.remove(0);
                else {
                    System.out.println("Arvuteid enam pole");
                    continue;
                }
                System.out.print("Arvuti info: ");
                System.out.println(parandatav.toString());
                System.out.print("Sisesta parandamiseks kulunud aeg (täisminutites): ");
                sisend = lugeja.nextLine();
                int minutid = Integer.parseInt(sisend);
                System.out.print("Sisesta enda nimi: ");
                sisend = lugeja.nextLine();
                double tunnitasu = tunintasud.get(sisend);
                double arve = 0;
                if (parandatav instanceof  VäliseMonitorigaArvuti){
                    arve += 3;
                }
                else arve += 2;

                if (parandatav.onKiirtöö()) arve += 10;

                arve += tunintasud.get(sisend) * minutidTundideks(minutid);
                rahaKokku += arve;
                System.out.println("Töö tehtud, arve summa on: "+arve+ "€!");

            }else if(sisend.equals("R")){
                sisend = lugeja.nextLine();
                loeArvuti(sisend);

            }else if (sisend.equals("L")){
                System.out.println("Sessiooni kokkuvõte: ");
                System.out.println("Teenitud raha: "+rahaKokku);
            System.exit(0);

            }else System.out.println("Vale sisend!");
        }
    }
    public static void kirjutaNaidis(){
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("tunnitasud.dat"))){
            dos.writeInt(3);
            dos.writeUTF("Peeter");
            dos.writeDouble(5.5);
            dos.writeUTF("Jaan");
            dos.writeDouble(5.3);
            dos.writeUTF("Marju");
            dos.writeDouble(5.2);
        } catch (Exception e) {

        }
    }

    public static double minutidTundideks(int minutid){
        return (double)minutid/60;
    }
}
