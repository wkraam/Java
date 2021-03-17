import java.util.ArrayList;
import java.util.List;

public class Atraktsioon {
    public int minVanus;
    public String nimi;

    public Atraktsioon(int minVanus, String nimi) {
        this.minVanus = minVanus;
        this.nimi = nimi;
    }

    public boolean vanusedSobivad(Dokument[] dokumendid) {
        return ebasobivadDokumendid(dokumendid).isEmpty();
    }

    public List<Dokument> ebasobivadDokumendid(Dokument[] dokumendid) {
        List<Dokument> Dokumendid = new ArrayList<>();
        for (Dokument dok : dokumendid) {
            if (!dok.vanusOnVähemalt(minVanus))
                Dokumendid.add(dok);
        }
        return Dokumendid;
    }

    public String toString(){
        return "Atraktsioon "+nimi+" on vanusepiiranguga "+minVanus;
    }
}
