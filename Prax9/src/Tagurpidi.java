import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Tagurpidi {
    public static void pööra(String fail){
        try(FileInputStream fis = new FileInputStream(fail)){
            byte[] baidid = fis.readAllBytes();
            String lõpp = fail.split("\\.")[1];
            fail = "tagurpidi."+lõpp;

            File uus = new File(fail);

            uus.createNewFile();

            try(FileOutputStream fos = new FileOutputStream(uus)){
                for (int i = baidid.length-1; i > -1; i--) {
                    fos.write(baidid[i]);
                }
            }

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        pööra("numbrid.txt");
    }
}
