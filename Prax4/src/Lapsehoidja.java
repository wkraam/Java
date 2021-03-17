public class Lapsehoidja {

    private int firmNumber;
    private String name;

    public Lapsehoidja(int firmNumber, String name) {
        this.firmNumber = firmNumber;
        this.name = name;
    }

    public int getFirmNumber() {
        return firmNumber;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getFirmNumber()+getName() ;
    }
}