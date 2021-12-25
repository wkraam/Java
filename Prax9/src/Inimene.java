import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Inimene {
    private String eesnimi;
    private String perenimi;
    private List<String> lapsed;

    public String getEesnimi() {
        return eesnimi;
    }

    public void setEesnimi(String eesnimi) {
        this.eesnimi = eesnimi;
    }

    public String getPerenimi() {
        return perenimi;
    }

    public void setPerenimi(String perenimi) {
        this.perenimi = perenimi;
    }

    public List<String> getLapsed() {
        return lapsed;
    }

    public void setLapsed(List<String> lapsed) {
        this.lapsed = lapsed;
    }

    public Inimene(String eesnimi, String perenimi, List<String> lapsed) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.lapsed = lapsed;
    }

    public Inimene(){

    }

    public static void kirjutaInimene(Inimene inimene, String failiNimi) {
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(failiNimi))){
            dos.writeUTF(inimene.getEesnimi());
            dos.writeUTF(inimene.getPerenimi());
            int lastearv = inimene.getLapsed().size();
            dos.writeInt(lastearv);
            for (int i = 0; i < lastearv; i++) {
                dos.writeUTF(inimene.getLapsed().get(i));
            }

        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    public static Inimene looInimene(String failinimi){
        Inimene uusInimene = new Inimene();
        try(DataInputStream din = new DataInputStream(new FileInputStream(failinimi))){
            uusInimene.setEesnimi(din.readUTF());
            uusInimene.setPerenimi(din.readUTF());
            int lapseArv = din.readInt();
            List<String> lapseNimed = new ArrayList<>();
            for (int i = 0; i < lapseArv; i++) {
                lapseNimed.add(din.readUTF());
            }
            uusInimene.setLapsed(lapseNimed);
        }catch(Exception ex){
            System.out.println(ex);
        }
        return uusInimene;
    }

    @Override
    public String toString() {
        return "Inimene{" +
                "eesnimi='" + eesnimi + '\'' +
                ", perenimi='" + perenimi + '\'' +
                ", lapsed=" + lapsed +
                '}';
    }

    public static void main(String[] args) {
        List<String> lapsed = new ArrayList<>();
        lapsed.add("Mari");
        lapsed.add("juhan");
        Inimene ma = new Inimene("Marjo", "Ismash", lapsed);

        kirjutaInimene(ma, "inimene.tx2");
        System.out.println(ma);
        System.out.println("..............................");
        Inimene ma2 = looInimene("inimene.tx2");
        System.out.println(ma2);
    }
}
