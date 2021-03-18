import java.util.ArrayList;
import java.util.List;

public class Loomad {
    List<Object> loomadList = new ArrayList<>();
    List<String> hääled = new ArrayList<>();
    public String Nimi;
    public int sugu;
    public int lapsed;
    public String hääl;

    public void häälitse(){
        System.out.println(hääl);
        hääled.add(hääl);
    }

    public void lisaLoomad(Object loom){
        loomadList.add(loom);
    }

    public String getLoomad(){
        String loomad = "loomad: ";
        for (Object loom:loomadList){
            loomad += loom;
        }
        return loomad;
    }
}
