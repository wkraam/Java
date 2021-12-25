import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class TekstiAnalüsaator {
    private String kodeering;
    private String sisendTekst;
    private File sisendFail;
    private int sisend;
    private Map<String, Integer> lib = new HashMap<>();
    private Map<String, Map<String, Integer>> lib2 = new HashMap<>();

    public TekstiAnalüsaator(String sisendTekst) {
        this.sisendTekst = sisendTekst;
        this.sisend = 1;
    }

    public TekstiAnalüsaator(String kodeering, File sisendFail) {
        this.kodeering = kodeering;
        this.sisendFail = sisendFail;
        this.sisend = 2;
    }

    public Map<String, Integer> sõnadeSagedus() throws IOException {
        if (sisend == 1){
            String[] laused = sisendTekst.split(" ");
            for (String sõna : laused) {
                if (lib.containsKey(sõna)) lib.put(sõna, lib.get(sõna)+1);
                else lib.put(sõna, 1);
            }
        }
        if (sisend == 2){
            String[] rida = Files.readString(sisendFail.toPath(), Charset.forName(kodeering)).split(" ");
            for (String sõna : rida) {
                if (lib.containsKey(sõna)) lib.put(sõna, lib.get(sõna)+1);
                else lib.put(sõna, 1);
            }
        }
        return lib;
    }

    public Map<String, Map<String, Integer>> sõnadeJärgnevus() throws IOException {
        int index=0;
        String[] rida = Files.readString(sisendFail.toPath(), Charset.forName(kodeering)).split(" ");
        for (String sõna : rida) {
            if (!lib2.containsKey(sõna)) {
                lib2.put(sõna, new HashMap<String, Integer>());
                if (!(rida.length == index+1)) {
                    String järgnev = rida[index + 1];
                    if (lib2.get(sõna).containsKey(järgnev)) lib2.get(sõna).put(järgnev, lib2.get(sõna).get(järgnev) + 1);
                    else lib2.get(sõna).put(järgnev, 1);
                }
            }
            else {
                String järgnev = rida[index + 1];
                lib2.get(sõna).put(järgnev, 1);
                }
            index++;
        }
        return lib2;
    }
}
