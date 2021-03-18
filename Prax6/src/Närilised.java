import java.util.ArrayList;
import java.util.List;

public class Närilised extends Loomad{
    private List<Object> närilised = new ArrayList<>();

    @Override
    public void lisaLoomad(Object loom){
        närilised.add(loom);
        super.lisaLoomad(loom);
    }

    public String getNärilised(){
        String loomad = "närilised: ";
        for (Object näriline:närilised){
            loomad += näriline+", ";
        }
        return loomad;
    }

    public String toString(){
        return getNärilised();
    }
}
