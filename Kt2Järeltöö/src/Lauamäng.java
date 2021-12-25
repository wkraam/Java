//tegi Walther Kraam

public class Lauamäng {
    private String nimi;
    private int miinimum;
    private int maksimum;
    private String tüüp;

    public Lauamäng(String nimi, int miinimum, int maksimum, String tüüp) throws EbasobivArvErind {
        if (miinimum<2){
            throw new EbasobivArvErind("Ebasobiv minimaalne mängijate arv!");
        }
        else if (maksimum<=miinimum){
            throw new EbasobivArvErind("Ebasobiv mängijate arvu vahemik!");
        }
        else {
            this.nimi = nimi;
            this.miinimum = miinimum;
            this.maksimum = maksimum;
            this.tüüp = tüüp;
        }
    }

    public String getNimi() {
        return nimi;
    }

    public int getMiinimum() {
        return miinimum;
    }

    public int getMaksimum() {
        return maksimum;
    }

    public String getTüüp() {
        return tüüp;
    }
}
