import java.util.ArrayList;
import java.util.List;

public class Külastaja2 {
    private List<String> külastusteKirjeldused;
    private int vanus;
    private double kulud;

    public void lisaKulud(double kulu){
        kulud += kulu;
    }

    public double kuludeSumma(){
        return kulud;
    }

    public int getVanus() {
        return vanus;
    }

    public Külastaja2(int vanus) {
        this.vanus = vanus;
        this.külastusteKirjeldused = new ArrayList<>();
        this.kulud = 0;
    }

    public void lisaKirjeldused(String kirjeldus){
        külastusteKirjeldused.add(kirjeldus);
    }

    public List<String> kõikKirjeldused(){
        return külastusteKirjeldused;
    }
}
