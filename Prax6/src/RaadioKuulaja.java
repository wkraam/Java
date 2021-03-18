import java.util.ArrayList;
import java.util.List;

public class RaadioKuulaja {
    private List<String> raadioSõnad = new ArrayList<>();

    public void kuula(String raadiosaade){
        raadioSõnad.add(raadiosaade);
    }

    public List<String> meenuta(){
        return raadioSõnad;
    }
}
