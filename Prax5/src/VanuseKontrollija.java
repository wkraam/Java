public class VanuseKontrollija implements Lõbustus{
    private int nõutudVanus;
    private Lõbustus delegaat;

    public VanuseKontrollija(int nõutudVanus, Lõbustus delegaat) {
        this.nõutudVanus = nõutudVanus;
        this.delegaat = delegaat;
    }

    @Override
    public void lõbusta(Külastaja2 külastaja){
        if (külastaja.getVanus() < nõutudVanus) külastaja.lisaKirjeldused("külastaja on liiga noor");
        else delegaat.lõbusta(külastaja);
    }
}
