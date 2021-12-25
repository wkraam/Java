//Walther Kraam
public class Broneering {
    private String nimi;
    private String aeg;
    private String vaktsiin;
    private int mitmes;

    public String getNimi() {
        return nimi;
    }

    public String getAeg() {
        return aeg;
    }

    public String getVaktsiin() {
        return vaktsiin;
    }

    public int getMitmes() {
        return mitmes;
    }

    @Override
    public String toString() {
        return  nimi + ", kell " + aeg + ", vaktsiin " + vaktsiin + ", "+ mitmes + ". kord";
    }

    public Broneering(String nimi, String aeg, String vaktsiin, int mitmes) throws EbasobivArvErind{
        if  (mitmes!=1 || mitmes !=2) {
            throw new EbasobivArvErind("Ebasobiv broneering: "+toString());
        }
        this.nimi = nimi;
        this.aeg = aeg;
        this.vaktsiin = vaktsiin;
        this.mitmes = mitmes;
    }
}
