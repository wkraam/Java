public class Isik {
    private String nimi;
    private double pikkus;

    //constructor
    public Isik(String nimi, double pikkus) {
        this.nimi = nimi;
        this.pikkus = pikkus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        this.pikkus = pikkus;
    }

    public String toString(){
        return "("+nimi+";"+pikkus+")";
    }
}
