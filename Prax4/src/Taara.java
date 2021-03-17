public class Taara {
    private String joogiNimi;
    private char joogiTahis;
    private String jooja;

    public Taara(String joogiNimi, char joogiTahis, String jooja) {
        this.joogiNimi = joogiNimi;
        this.joogiTahis = joogiTahis;
        this.jooja = jooja;
    }

    public String getJoogiNimi() {
        return joogiNimi;
    }

    public char getJoogiTahis() {
        return joogiTahis;
    }

    public String getJooja() {
        return jooja;
    }

    public static double tagatisRaha(char joogiTahis){
        if (joogiTahis == 'A') return Peaklass.tagatisA;
        else if (joogiTahis == 'B' || joogiTahis=='C'|| joogiTahis=='D') return Peaklass.tagatisB;
        else return 0;
    }

    public double maksumus(){
        return tagatisRaha(this.joogiTahis);
    }
}
