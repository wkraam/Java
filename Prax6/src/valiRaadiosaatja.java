import java.util.List;

public class valiRaadiosaatja extends Raadiosaatja{
    @Override
    public void edasta(String edastus){
        for (RaadioKuulaja raadio:kuulajad) {
            super.edasta(edastus.toUpperCase());
        }
    }
}
