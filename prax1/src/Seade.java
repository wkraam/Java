public class Seade {
    int kood;
    String nimetus;
    double hindIlmaKäibemaksuta;
    static double käibemaksuProtsent = 0.2;

    public Seade(int kood, String nimetus, double hindIlmaKäibemaksuta){
        this.kood = kood;
        this.nimetus = nimetus;
        this.hindIlmaKäibemaksuta = hindIlmaKäibemaksuta;
    }

    public int getKood() {
        return kood;
    }

    public void setKood(int kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getHindIlmaKäibemaksuta() {
        return hindIlmaKäibemaksuta;
    }

    public void setHindIlmaKäibemaksuta(double hindIlmaKäibemaksuta) {
        this.hindIlmaKäibemaksuta = hindIlmaKäibemaksuta;
    }

    public static double getKäibemaksuProtsent() {
        return käibemaksuProtsent;
    }

    public static void setKäibemaksuProtsent(double käibemaksuProtsent) {
        Seade.käibemaksuProtsent = käibemaksuProtsent;
    }

    public String toString(){
        return "Nimetus: "+nimetus+", ja hind ilma käibemaksuta: "+hindIlmaKäibemaksuta+"€";
    }

    public double kmhind(){
        return hindIlmaKäibemaksuta + (hindIlmaKäibemaksuta * käibemaksuProtsent); //hind + hind*0.2(KMprotsent)
    }
}
