public abstract class Teos implements Comparable<Teos>{
    private String kirjeldus;
    private String teoseTähis;
    private String laenutaja;
    private int päevadeArv;

    public Teos(String kirjeldus, String teoseTähis, String laenutaja, int päevadeArv) {
        this.kirjeldus = kirjeldus;
        this.teoseTähis = teoseTähis;
        this.laenutaja = laenutaja;
        this.päevadeArv = päevadeArv;
    }

    abstract boolean kasHoidlast();

    public String getTeoseTähis() {
        return teoseTähis;
    }

    public int laenutusaeg(){
        return switch (teoseTähis) {
            case "roheline" -> 1;
            case "kollane" -> 30;
            case "sinine" -> 60;
            case "puudub" -> 14;
            default -> 0;
        };
    }

    public double päevaneViivis(){
        return switch (teoseTähis) {
            case "roheline" -> 2;
            case "kollane" -> 0.05;
            case "sinine" -> 0.05;
            case "puudub" -> 0.15;
            default -> 0;
        };
    }

    public void arvutaViivis(Kontrollija kontrollija){
        int lubatud = laenutusaeg();
        if (päevadeArv>lubatud){
            int üle = päevadeArv-lubatud;
            kontrollija.salvestaViivis(laenutaja, kirjeldus, üle*päevaneViivis());
        }
    }

    @Override
    public String toString() {
        return "Teos{" +
                "kirjeldus='" + kirjeldus + '\'' +
                ", teoseTähis='" + teoseTähis + '\'' +
                ", laenutaja='" + laenutaja + '\'' +
                ", päevadeArv=" + päevadeArv +'\'' +
                ", kashoidlast= "+ kasHoidlast()+
                '}';
    }

    @Override
    public int compareTo(Teos o) {
        return kirjeldus.compareTo(o.kirjeldus);
    }
}
