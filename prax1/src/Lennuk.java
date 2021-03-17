public class Lennuk {
    private String name; // ICAO abreviation
    private double avgSpeed; // in kt TAS
    private int maxPax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public int getMaxPax() {
        return maxPax;
    }

    public void setMaxPax(int maxPax) {
        this.maxPax = maxPax;
    }

    public Lennuk(String name, double avgSpeed, int maxPax) {
        this.name = name;
        this.avgSpeed = avgSpeed;
        this.maxPax = maxPax;
    }

    public Lennuk(){
        this.name = "A320";
        this.avgSpeed = 450;
        this.maxPax = 220;

    }

    public String toString(){
        return name+" , "+maxPax+" istekohta";
    }
}
