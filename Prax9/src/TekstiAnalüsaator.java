import java.io.*;

public class TekstiAnalüsaator {
    private String failiNimi;

    public TekstiAnalüsaator(String failiNimi) {
        this.failiNimi = failiNimi;
    }

    public int sõneEsinemisteArv(String sone) throws IOException {
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(failiNimi)));
        if (br.readLine().contains(sone)) cnt++;
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        TekstiAnalüsaator analüsaator = new TekstiAnalüsaator("kiri.txt");
        int esinemisteArv = analüsaator.sõneEsinemisteArv("kala");
    }
}
