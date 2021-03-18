public class Raamat extends Teos{
    private String kirjeldus;
    private String teoseTähis;
    private String laenutaja;
    private int päevadeArv;

    public Raamat(String kirjeldus, String teoseTähis, String laenutaja, int päevadeArv) {
        super(kirjeldus, teoseTähis, laenutaja, päevadeArv);
    }

    @Override
    boolean kasHoidlast() {
        return getTeoseTähis().equals("sinine") || getTeoseTähis().equals("kollane") ;
    }

    @Override
    public String toString() {
        return super.toString().replace("Teos", "Raamat");
    }
}
