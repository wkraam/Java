import java.util.List;
public class UudiseRaadio extends Raadiosaatja{
    public void uuendaAktuaalsedUudised(List<String> uudised){
        edastaUudised(uudised);
    }

    private void edastaUudised(List<String> uudised){
        for (int i = 0; i < uudised.size(); i++) {
            super.edasta(uudised.get(i));
        }
    }
}
