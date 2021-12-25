//Programm, mis teeb koopia etteantud failist:
import java.io.*;

public class KopeeriFail {

    private static void kopeeri(String algne, String koopia) throws Exception {
        // sulgudes semikoolonit kasutades saab mitu faili avada
        try (InputStream sisse = new FileInputStream(algne);
             OutputStream välja = new FileOutputStream(koopia)) {
            byte[] puhver = new byte[1024];
            int loetud = sisse.read(puhver);
            while (loetud > 0) {
                välja.write(puhver, 0, loetud); // ainult andmetega täidetud osa!
                loetud = sisse.read(puhver); // loeme järgmise tüki
            }
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Kas sa andsid käsurealt faili nime?");
            System.exit(1);
        }
        kopeeri(args[0], args[0] + ".copy");
    }
}