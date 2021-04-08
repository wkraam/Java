import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Korterelamu{
    private List<Korter> korteriteNimekiri;

    public Korterelamu(List<Korter> korteriteNimekiri) {
        this.korteriteNimekiri = korteriteNimekiri;
    }

    public double keskminePindala(){
        if (korteriteNimekiri.isEmpty()){
            return 0.0;
        }
        double keskminePindala = 0.0d;
        for (Korter korter: korteriteNimekiri) {
            keskminePindala += korter.getPindala();
        }
        return keskminePindala/ korteriteNimekiri.size();
    }

    public List<Korter> vabadKorterid(){
        List<Korter> vabadKorterid = new ArrayList<>();
        for (Korter korter: korteriteNimekiri) {
            if (korter.isKuulubFirmale()){ vabadKorterid.add(korter); }
        }
        return vabadKorterid;
    }

    public void näitaKortereid(){
        Collections.sort(korteriteNimekiri);
        for(Korter korter: korteriteNimekiri){
            System.out.println(korter);
        }
    }
}
