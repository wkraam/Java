import java.io.*;

public class PuhverdatudVood {
    public static void puhvedatudVood(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("käsurida.txt")));
        for (int i = 0; i < args.length; i++) {
            bw.write(args[i]);
            bw.write("; ");
        }
        //bw.write(args[0]);
        bw.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("käsurida.txt")));
        System.out.println(br.readLine());
    }
    public static void main(String[] args) throws IOException {
        puhvedatudVood(args);
    }
}
