import java.io.*;
import java.util.*;

//Walther Kraam
public class Vaktsineerimiskeskus {
    private static Queue<Broneering> loeBroneeringud(String failiNimi) throws EbasobivArvErind {
        try (DataInputStream din = new DataInputStream(new FileInputStream(failiNimi))) {
            Queue<Broneering> broneeringud = new PriorityQueue<>();

            int broneeringuteArv = din.readInt();

            for (int i = 0; i < broneeringuteArv; i++) {
                String nimi = din.readUTF();
                String aeg = din.readUTF();
                String vaktsiin = din.readUTF();
                int kord = din.readInt();
                if (kord > 2 || kord < 1){
                    throw new EbasobivArvErind("Ebasobiv broneering: " + nimi + ", kell " + aeg + ", vaktsiin " + vaktsiin + ", "+ kord + ". kord");
                }
                broneeringud.add(new Broneering(nimi, aeg, vaktsiin, kord));
            }
            return broneeringud;
        } catch(IOException e){
            System.out.println("Fataalne viga!");
            System.exit(-1);
        }
        return null;
    }

    private static Map<String, List<Broneering>> vaktsiinideKaupa(List<Broneering> lõpetatudBroneeringud){
        Map<String, List<Broneering>> vaktsiineeritud = new HashMap<>();

        for (Broneering broneering : lõpetatudBroneeringud) {
            String vaktsiin = broneering.getVaktsiin();
            if (!vaktsiineeritud.containsKey(vaktsiin)){
                vaktsiineeritud.put(vaktsiin, new ArrayList<Broneering>());
            }
            vaktsiineeritud.get(vaktsiin).add(broneering);
        }

        return vaktsiineeritud;
    }

    public static void main(String[] args) throws IOException, EbasobivArvErind {
        List<Broneering> lõpetatudBroneeringud = new ArrayList<>();
        Queue<Broneering> broneeringud = loeBroneeringud("broneeringud.dat");

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Palun valige üks järgmistest tegevustest:");
            System.out.print("(J)ärgmine broneering, (V)aata lõpetatud broneeringuid vaktsiinide kaupa,\n" +
                    "(S)alvesta ja lõpeta: ");
            String sisend = sc.nextLine();
            if (sisend.equals("J")){
                if (!broneeringud.isEmpty()){
                    Broneering bron = broneeringud.remove();
                    lõpetatudBroneeringud.add(bron);
                    System.out.println(bron);
                }
            }
            else if (sisend.equals("V")){
                Map<String, List<Broneering>> vaktsiinidekaupa = vaktsiinideKaupa(lõpetatudBroneeringud);
                Set<String> vaktsiinid = vaktsiinidekaupa.keySet();
                System.out.println("On olemas järgmiste vaktsiinide lõpetatud broneeringud: "+vaktsiinid.toArray());
                System.out.print("sisesta vaktsiin: ");
                String vastus = sc.nextLine();
                while (true) {
                    if (vaktsiinid.contains(vastus)) {
                        System.out.println(vastus + "vaktsiiniga lõpetatud broneeringud:");
                        for (int i = 0; i < vaktsiinidekaupa.size(); i++) {
                            if (vaktsiinid.equals(vastus)){
                                for (int j = 0; j < vaktsiinidekaupa.get(vastus).size(); j++) {
                                    System.out.println(vaktsiinidekaupa.get(vastus).get(j));
                                }
                            }
                        }

                    } else
                        System.out.println("sellist vaktsiini ei ole, vali vaktsiin uuesti: " + vaktsiinid.toArray());
                }
            }
            else if (sisend.equals("S")){
                for (int i = 0; i < lõpetatudBroneeringud.size(); i++) {


                }
                    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream()))


            }
            else System.out.println("Vigane sisend");
        }
    }
}
