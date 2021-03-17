public class Elektriauto {
    private String automark;
    private double elektriKulu;
    private int laadimisaeg;
    private int sõiduUlatus;
    private double elekriHind;

    public int getLaadimisaeg() {
        return laadimisaeg;
    }

    public void setLaadimisaeg(int laadimisaeg) {
        this.laadimisaeg = laadimisaeg;
    }

    public Elektriauto(String automark, double elektriKulu, int laadimisaeg, int sõiduUlatus, double elektriHind) {
        this.automark = automark;
        this.elektriKulu = elektriKulu;
        this.laadimisaeg = laadimisaeg;
        this.sõiduUlatus = sõiduUlatus;
        this.elekriHind = elektriHind;
    }


    public double maksumus100(){
        return elekriHind * 100;
    }

    public double maksumus(int teepikkus){
        return (teepikkus*maksumus100())/100;
    }

    public double reisiKestus(int teepikkus, double avgSpeed){
        return ((teepikkus/sõiduUlatus)*laadimisaeg)+teepikkus/avgSpeed;
    }

    public String toString(){
        return automark+"- 100km maksumus -"+maksumus100();
    }
}
