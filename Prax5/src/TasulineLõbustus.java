public class TasulineLõbustus implements Lõbustus{
    private double hind;
    private Lõbustus delegaat;

    public TasulineLõbustus(double hind, Lõbustus delegaat) {
        this.hind = hind;
        this.delegaat = delegaat;
    }

    public void lõbusta(Külastaja2 külastaja){
        delegaat.lõbusta(külastaja);
        külastaja.lisaKulud(hind);
        külastaja.lisaKirjeldused("tasusin külastuse eest"+hind);
    }
}
