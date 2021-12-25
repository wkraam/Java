import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Pakkija {
    public static void main(String[] args) throws IOException {
        File lähtefail=null;
        try {
            lähtefail = new File(args[0]);
            File zipFail = new File(args[1]);

            paki(lähtefail, zipFail);
            System.out.println("Varukoopia tehtud.");

            lähtefail.delete();
            System.out.println("Algne fail kustutatud.");
            System.out.println("Kena päeva!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Halvad failinimed, programm sulgeb.");
            System.exit(-1);
        }
    }

    private static void paki(File lähtefail, File zipFail) throws IOException, FileNotFoundException {
        FileInputStream sisendvoog = null;
        ZipOutputStream zipvoog = null;
        try {
            sisendvoog = new FileInputStream(lähtefail);
            zipvoog = new ZipOutputStream(
                    new BufferedOutputStream(new FileOutputStream(zipFail)));

            zipvoog.putNextEntry(new ZipEntry(lähtefail.getName()));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = sisendvoog.read(buffer)) > 0) {
                zipvoog.write(buffer, 0, length);
            }
            zipvoog.closeEntry();
            sisendvoog.close();
            zipvoog.close();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Tekkis faili kirjutamises kriitiline viga, programm sulgeb.");
            zipvoog.closeEntry();
            sisendvoog.close();
            zipvoog.close();
            System.exit(-1);
        } finally {
            zipvoog.closeEntry();
            sisendvoog.close();
            zipvoog.close();
        }
    }
}