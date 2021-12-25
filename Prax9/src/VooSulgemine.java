import java.io.*;
import java.util.Scanner;

public class VooSulgemine {
    public static void vooSulgemine(String[] args) throws IOException {
        String failiNimi = args[0];
        FileInputStream file = new FileInputStream(new File(failiNimi));
        file.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        vooSulgemine(args);
    }
}
