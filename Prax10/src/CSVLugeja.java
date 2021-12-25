import java.io.*;
import java.util.Arrays;

public class CSVLugeja implements AutoCloseable{
    private BufferedReader br;

    private CSVLugeja(String failinimi) throws IOException {
        if (!failinimi.endsWith(".csv")&&!failinimi.endsWith(".CSV")) throw new IOException();
        this.br=new BufferedReader(new InputStreamReader(new FileInputStream(failinimi)));
    }
    public String[] loeRida() throws IOException {
        String rida = br.readLine();
        if (rida!=null){
            return rida.split(",");
        }
        return null;
    }

    @Override
    public void close() throws Exception {
        br.close();
    }

    public static void main(String[] args) {
        try(CSVLugeja luger = new CSVLugeja("n.csv")){
            String[] rida = luger.loeRida();
            while (rida!=null){
                System.out.println(Arrays.toString(rida));
                rida= luger.loeRida();
            }

        }catch (Exception e){

        }
    }
}
