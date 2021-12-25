public class Hoidla<ESIMENE, TEINE> {
    private ESIMENE esimeneObjekt;
    private TEINE teineObjekt;

    public Hoidla() {

    }

    @Override
    public String toString() {
        return "Hoidla{" +
                "esimeneObjekt=" + esimeneObjekt +
                ", teineObjekt=" + teineObjekt +
                '}';
    }

    public ESIMENE getEsimeneObjekt() {
        return esimeneObjekt;
    }

    public void setEsimeneObjekt(ESIMENE esimeneObjekt) {
        this.esimeneObjekt = esimeneObjekt;
    }

    public TEINE getTeineObjekt() {
        return teineObjekt;
    }

    public void setTeineObjekt(TEINE teineObjekt) {
        this.teineObjekt = teineObjekt;
    }

    public Hoidla(ESIMENE esimeneObjekt, TEINE teineObjekt) {
        this.esimeneObjekt = esimeneObjekt;
        this.teineObjekt = teineObjekt;
    }
}
