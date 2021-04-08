public abstract class Korter implements Comparable<Korter>{
    private double pindala;
    private int hind;
    private Elanik elanik;
    private boolean kuulubFirmale;

    public Korter(double pindala, int hind) {
        this.pindala = pindala;
        this.hind = hind;
        this.kuulubFirmale = true;
    }

    public abstract int väärtus();

    public void tehing(Elanik elanik1){
        this.elanik = elanik1;
        this.kuulubFirmale = false;
    }

    public String elanikuInfo(){
        if (kuulubFirmale == true){
            return "elanik puudub";
        }
        else{
            return elanik.toString();
        }
    }

    public double getPindala() {
        return pindala;
    }

    public void setPindala(double pindala) {
        this.pindala = pindala;
    }

    public int getHind() {
        return hind;
    }

    public void setHind(int hind) {
        this.hind = hind;
    }

    public Elanik getElanik() {
        return elanik;
    }

    public void setElanik(Elanik elanik) {
        this.elanik = elanik;
    }

    public boolean isKuulubFirmale() {
        return kuulubFirmale;
    }

    public void setKuulubFirmale(boolean kuulubFirmale) {
        this.kuulubFirmale = kuulubFirmale;
    }

    @Override
    public String toString() {
        return "Korter{" +
                "pindala=" + pindala +
                ", hind=" + hind +
                ", elanik=" + elanik +
                '}';
    }

    public int compareTo(Korter võrreldavPindala) {
        if (getPindala() < võrreldavPindala.getPindala())
            return -1; // negatiivne arv näitab, et this on väiksem kui võrreldav
        if (getPindala() > võrreldavPindala.getPindala())
            return 1; // positiivne arv näitab, et this on suurem kui võrreldav
        return 0; // null tähendab, et mõlemad on võrdsed
    }
}
