import java.io.*;

public class Ül6 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[0])));
        bw.write("Hello wolrd!");
    }
}
// fail jäi tühjaks, kuna me ei ole seda sulenud