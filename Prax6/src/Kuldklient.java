public class Kuldklient extends Klient {

    private String kliendiHaldur;

    public Kuldklient(int isikukood, double saldo, String kliendiHaldur, double aktsiaPortfelliVäärtus) {
        super(isikukood, saldo, aktsiaPortfelliVäärtus); // Klient konstruktori käivitamine
        this.kliendiHaldur = kliendiHaldur;
    }

    @Override
    public double arvutaTehinguTasud() {
        return 10.0;
    }

    @Override
    public double arvutaPortfelliHaldustasu() {
        if (getAktsiaPotfelliVäärtus()<50000) {
            return 0;
        } else {
            return getAktsiaPotfelliVäärtus()*0.005;
        }

    }

    @Override
    public String toString(){
        return "klient " + getIsikukood() + ", saldo " + getSaldo() + ", kliendihaldur " + kliendiHaldur;
    }
}