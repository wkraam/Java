import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Paroolid {
    public static void leiaParoolid(String failiNimi){
        List<String> paroolid = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(failiNimi), "UTF-8"))) {
            // faili kasutamine
            String rida;
            while((rida=br.readLine())!=null){
                if (rida.contains("parool:")){
                    String massiiv = rida.split("parool: ")[1].split(" ")[0];
                    paroolid.add(massiiv);
                }
            }
        }catch(Exception ex){}
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("paroolid.txt"), "UTF-8"))){
            for (String parool : paroolid) {
                bw.write(parool);
                bw.newLine();
            }
        }catch(Exception ex){
            System.out.println("Fataalne viga!");
        }
    }

    public static void main(String[] args) {
        leiaParoolid("peidetud.txt");
    }
}
