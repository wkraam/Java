public class LõbustavKloun implements Lõbustus{
    private Kloun kloun;

    public LõbustavKloun(Kloun kloun) {
        this.kloun = kloun;
    }

    public void lõbusta(Külastaja2 külaline){
        kloun.esine(külaline);
    }
}
