import java.util.ArrayList;
import java.util.List;

public class Kahepaiksed extends Loomad{
    private List<Object> kahepaiksed = new ArrayList<>();

    @Override
    public void lisaLoomad(Object loom){
        kahepaiksed.add(loom);
        super.lisaLoomad(loom);
    }

    public String getKahepaiksed(){
        String loomad = "kahepaiksed: ";
        for (Object kahepaikne:kahepaiksed){
            loomad += kahepaikne+", ";
        }
        return loomad;
    }

    public String toString(){
        return getKahepaiksed();
    }
}