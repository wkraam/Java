import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tunniplaan {
    String[] ained;
    int[] algused;

    public Tunniplaan(String[] ained, int[] algused) {
        this.ained = ained;
        this.algused = algused;
    }

    public void setAlgused(int[] algused) {
        this.algused = algused;
    }

    public Tunniplaan(DataInputStream algneFail)throws Exception{
        int paarid = algneFail.readInt(); //aine-algusaeg paaride arv
        String aine = algneFail.readUTF(); // aine String
        int algus = algneFail.readInt(); // algusaeg int

        List<String> ainedList = new ArrayList<>();
        List<Integer> algusedList = new ArrayList<>();

        for (int i = 0; i < paarid; i++) {
            ainedList.add(aine);
            algusedList.add(algus);
        }
        this.ained = ainedList.toArray(new String[paarid]);
        //setAlgused(algusedList.toArray(new int[paarid]));
    }

    public int annaAlgusaeg(String aine){
        for (int i = 0; i < ained.length; i++) {
            if (ained[i].matches(aine)) {
                return algused[i];
            }
        }
        return 0;
    }

    public void kirjutaFaili(String failinimi) throws IOException {
        FileOutputStream file = new FileOutputStream(failinimi);
        DataOutputStream dos = new DataOutputStream(file);
        dos.writeInt(ained.length);
        for (int i = 0; i < ained.length; i++) {
            dos.writeUTF(ained[i]);
            dos.writeInt(algused[i]);
        }
    }
}
