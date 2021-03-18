import java.util.ArrayList;
import java.util.List;

public class HajameelneKuulaja extends RaadioKuulaja{
    private List<String> raadioSõnad = new ArrayList<>();
    private int cnt = 0;
    @Override
    public void kuula(String raadiosaade){
        if (cnt % 2 == 0) {
            raadioSõnad.add(raadiosaade);
        }
        cnt++;
    }
}
