import java.util.ArrayList;
import java.util.List;

public class Klient {

    private int isikukood;
    private double saldo;
    private double aktsiaPotfelliVäärtus;
    private List<String> tehingud = new ArrayList<>();

    public Klient(int isikukood, double saldo, double aktsiaPotfelliVäärtus) {
        this.isikukood = isikukood;
        this.saldo = saldo;
        this.aktsiaPotfelliVäärtus = aktsiaPotfelliVäärtus;
    }

    public void teostaÜlekanne(String kontole, double summa) {
        tehingud.add("ülekanne kontole " + kontole + ", summa " + summa);
        saldo -= summa;
    }

    public double arvutaTehinguTasud() {
        return 0.1 * tehingud.size();
    }

    public int getIsikukood() {
        return isikukood;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "klient " + isikukood + ", saldo " + saldo;
    }

    public double getAktsiaPotfelliVäärtus() {
        return aktsiaPotfelliVäärtus;
    }

    public double arvutaPortfelliHaldustasu() {
        return aktsiaPotfelliVäärtus*0.005;
    }
}