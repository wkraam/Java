import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class testKlass {
    public static List<Teos> loeTeosed(String failinimi) throws IOException {
        Scanner scanner = new Scanner(new File(failinimi), StandardCharsets.UTF_8);
        List<Teos> teosed= new ArrayList<>();
        while (scanner.hasNext()){
            String rida = scanner.nextLine();
            String[]atribuudid = rida.split("; ");
            if (rida.contains("/")){
                String aasta = atribuudid[0].split("/")[1];
                aasta = aasta.split(",")[0];
                int aastaAjakiri = Integer.parseInt(aasta);
                teosed.add(new Ajakiri(atribuudid[0],aastaAjakiri, atribuudid[1], atribuudid[2], Integer.parseInt(atribuudid[3])));
            }else{
                teosed.add(new Raamat(atribuudid[0], atribuudid[1], atribuudid[2], Integer.parseInt(atribuudid[3])));
            }
        }
        return teosed;
    }
    public static void main(String[] args) throws IOException {
        List<Teos> teosed = loeTeosed("laenutus.txt");
        System.out.println(teosed);
        Collections.sort(teosed);
        System.out.println(teosed);

        ViiviseHoiataja VH = new ViiviseHoiataja(0.2);
        SuurimaViiviseLeidja SVL = new SuurimaViiviseLeidja();
        for (Teos teos : teosed) {
            teos.arvutaViivis(VH);
            teos.arvutaViivis(SVL);
        }
        for (String nimi : VH.getHoiatatavadLaenutajad()) {
            System.out.println(nimi);
        }
        SVL.saadaHoiatus();
    }
}
