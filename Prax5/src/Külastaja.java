import java.util.Comparator;
import java.util.List;

public class Külastaja implements Comparable<Külastaja> {
    private String nimi;
    private int külastatudAtraktsioonid;

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getKülastatudAtraktsioonid() {
        return külastatudAtraktsioonid;
    }

    public void setKülastatudAtraktsioonid(int külastatudAtraktsioonid) {
        this.külastatudAtraktsioonid = külastatudAtraktsioonid;
    }

    public Külastaja(String nimi, int külastatudAtraktsioonid) {
        this.nimi = nimi;
        this.külastatudAtraktsioonid = külastatudAtraktsioonid;
    }

    public String toString(){
        return nimi + " külastas " + külastatudAtraktsioonid + " atraktsioone.";
    }
    public int compareTo(Külastaja võrreldavKülastaja) {
        if (getKülastatudAtraktsioonid() < võrreldavKülastaja.getKülastatudAtraktsioonid())
            return -1; // negatiivne arv näitab, et this on väiksem kui võrreldav
        if (getKülastatudAtraktsioonid() > võrreldavKülastaja.getKülastatudAtraktsioonid())
            return 1; // positiivne arv näitab, et this on suurem kui võrreldav
        return 0; // null tähendab, et mõlemad on võrdsed
    }
}

