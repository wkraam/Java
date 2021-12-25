//tegi Walther Kraam

import java.io.*;
import java.util.*;

public class Lauamängupood {
    private static List<Lauamäng> loeLauamängud(String failiNimi){
        List<Lauamäng> tagastusMängud = new ArrayList<>();
        try {
            File file = new File(failiNimi);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String[] rida = sc.nextLine().split(",");
                tagastusMängud.add(new Lauamäng(rida[0], Integer.parseInt(rida[1]), Integer.parseInt(rida[2]), rida[3]));
            }
        } catch (FileNotFoundException e){
            System.out.println("vastavat faili ei leitud!");
            System.exit(-1);
        } catch (EbasobivArvErind e){

        }

        return tagastusMängud;
    }

    private static Map<String, List<Lauamäng>> tüübiKaupa(List<Lauamäng> lauamängList){
        //map(key, value)
        Map<String, List<Lauamäng>> tagastusMap = new HashMap<>();

        for (Lauamäng lauamäng : lauamängList) {
            if (tagastusMap.containsKey(lauamäng.getTüüp())){
                tagastusMap.get(lauamäng.getTüüp()).add(lauamäng);
            } else {
                List<Lauamäng> lauamängs = new ArrayList<>();
                lauamängs.add(lauamäng);
                tagastusMap.put(lauamäng.getTüüp(), lauamängs);
            }
        }

        return tagastusMap;
    }

    private static Set<String> sobivadLauamängud(List<Lauamäng> lauamängud, int mängijateArv){
        Set<String> sobivadMängud = new HashSet<>();
        for (Lauamäng mäng : lauamängud) {
            if (mäng.getMiinimum() <= mängijateArv){
                if (mängijateArv <= mäng.getMaksimum()){
                    sobivadMängud.add(mäng.getNimi());
                }
            }
        }
        return sobivadMängud;
    }



    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String valik = "";

        List<Lauamäng> mängud = loeLauamängud("lauamängud.txt");

        while (true) {
            System.out.println("Palun valige üks järgmistest tegevustest:");
            System.out.println("(O)tsi sobiv lauamäng, (S)alvesta ja lõpeta:");
            valik = sc.nextLine();

            if (valik.matches("O")) {
                System.out.print("Olemasolevad tüübid: ");
                System.out.println(tüübiKaupa(mängud).keySet());
                System.out.print("Sisesta tüüp: ");
                String tüübiValik = sc.nextLine();

                while (!tüübiKaupa(mängud).keySet().contains(tüübiValik)) {
                    System.out.print("Sellist tüüpi pole. Vali tüüp uuesti:");
                    System.out.println(tüübiKaupa(mängud).keySet());
                    tüübiValik = sc.nextLine();
                }

                if (tüübiKaupa(mängud).keySet().contains(tüübiValik)) {
                    System.out.print("sisesta mängijate arv: ");
                    int mängijateArv = sc.nextInt();
                    System.out.print("sobivad lauamängud: ");
                    if (sobivadLauamängud(tüübiKaupa(mängud).get(tüübiValik), mängijateArv).isEmpty()){
                        System.out.println("Sobivat lauamängu ei ole.");
                    }
                    else System.out.println(sobivadLauamängud(tüübiKaupa(mängud).get(tüübiValik), mängijateArv));
                }
            }

            if (valik.matches("S")) {
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("lauamängud.dat"));
                dos.writeInt(mängud.size());
                for (Lauamäng lauamäng : mängud) {
                    dos.writeUTF(lauamäng.getNimi());
                    dos.writeInt(lauamäng.getMiinimum());
                    dos.writeInt(lauamäng.getMaksimum());
                    dos.writeUTF(lauamäng.getTüüp());
                }
            }

            if (valik.matches("lõpeta")){
                System.out.println("lõpetan töö");
                System.exit(1);
            }
        }
    }
}
