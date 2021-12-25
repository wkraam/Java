import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Mp3Analüsaator {

    private static String failinimi;

    public String getFailinimi() {
        return failinimi;
    }

    public Mp3Analüsaator(String failinimi) {
        this.failinimi = failinimi;
    }

    public static boolean onKantri() throws IOException {
        RandomAccessFile file = new RandomAccessFile(new File(failinimi), "r");
        long baitidePikkus = file.length();
        file.seek(baitidePikkus-1);
        return file.readByte()==2;

    }
}
