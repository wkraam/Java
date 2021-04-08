import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Peaklass {

    public static List<Korter> loeKorterid(String failinimi) throws IOException {
        Scanner scanner = new Scanner(new File(failinimi), StandardCharsets.UTF_8);
        List<Korter> korterid = new ArrayList<>();
        while (scanner.hasNext()) {
            String rida = scanner.nextLine();
            String[] atribuudid = rida.split(", ");
            double pindala = Double.parseDouble(atribuudid[0]);
            int hind = Integer.parseInt(atribuudid[1]);
            String tehinguLiik = atribuudid[2];
            if (tehinguLiik.matches("rent")) {
                korterid.add(new Rendikorter(pindala, hind));
            }
            if (tehinguLiik.matches("müük")) {
                korterid.add(new Omandkorter(pindala, hind));
            }
        }
        return korterid;
    }

    public static void main(String[] args) throws IOException {
        List<Korter> korterid = loeKorterid("korterid.txt");
        Elanik Volli = new Elanik("Volli");
        Elanik Vello = new Elanik("Vello");
        Elanik Tarmo = new Elanik("Tarmo");
        Collections.shuffle(korterid);

        korterid.get(0).tehing(Volli);
        korterid.get(1).tehing(Vello);
        korterid.get(2).tehing(Tarmo);

        System.out.println("-----------Korterid------------ ");
        Korterelamu korterelamu = new Korterelamu(korterid);
        korterelamu.näitaKortereid();
        System.out.println();
        System.out.println("Kekmine pindala: "+korterelamu.keskminePindala());
        System.out.println();
        System.out.println("-----------Vabad korterid------------ ");
        for(Korter korter: korterelamu.vabadKorterid()){
            System.out.println(korter);
        }

    }
}