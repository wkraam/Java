public class Kloun {
    private String nimi;
    public Kloun(String nimi) {
        this.nimi = nimi;
    }
    public void esine(Külastaja2 külastaja) {
        külastaja.lisaKirjeldused("nägin klouni nimega " + nimi);
    }
}
