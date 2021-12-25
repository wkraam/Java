import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Tellimus> tellimused = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("tellimused.txt")))){
            String rida = br.readLine();
            while (rida!=null){
                List<Pitsa> pitsad = new ArrayList<>();
                String[] l = rida.split(";");
                String nimi = l[0];
                for (int i = 1; i < l.length; i++) {
                    String[] pitsa = l[i].split("/");
                    String pitsaNimi = pitsa[0];
                    double hind = Double.parseDouble(pitsa[1]);
                    Pitsa pitsa1 = new Pitsa(pitsaNimi, hind);
                    pitsad.add(pitsa1);
                }
                int ooteaeg = 10+ new Random().nextInt(26);
                System.out.println(ooteaeg);
                tellimused.add(new Tellimus(nimi, pitsad, ooteaeg));
                rida = br.readLine();
            }
            double raha = 0;
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("liigaAeglased.txt")));
            for (Tellimus tellimus : tellimused) {
                try {
                    raha+= tellimus.maksumus();
                } catch (LiigaPikkOotamineErind e){
                    bw.write(tellimus.toString()+"\n");
                }
            }
            bw.close();

            System.out.println("teenitud taha: "+raha);
        } catch (Exception e) {

        }
    }
}
