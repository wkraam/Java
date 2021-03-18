import java.util.ArrayList;
import java.util.List;

public class Raadiosaatja {
    List<RaadioKuulaja> kuulajad = new ArrayList<>();

    public void lisaKuulaja(RaadioKuulaja kuulaja){
        kuulajad.add(kuulaja);
    }

    public void edasta(String edastus){
        for (RaadioKuulaja raadio:kuulajad) {
            raadio.kuula(edastus);
        }
    }
}
