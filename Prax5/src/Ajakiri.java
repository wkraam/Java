public class Ajakiri extends Teos{
    private int aasta;

    public Ajakiri(String kirjeldus,int aasta, String teoseTähis, String laenutaja, int päevadeArv) {
        super(kirjeldus, teoseTähis, laenutaja, päevadeArv);
        this.aasta = aasta;
    }

    @Override
    boolean kasHoidlast() {
        return aasta <= 2000;
    }

    @Override
    public String toString() {
        return super.toString().replace("Teos", "Ajakiri");
    }
}
