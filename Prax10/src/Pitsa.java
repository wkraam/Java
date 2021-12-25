public class Pitsa {
    private String nimetus;

    @Override
    public String toString() {
        return "Pitsa{" +
                "nimetus='" + nimetus + '\'' +
                ", hind=" + hind +
                '}';
    }

    public String getNimetus() {
        return nimetus;
    }

    public double getHind() {
        return hind;
    }

    public Pitsa(String nimetus, double hind) {
        this.nimetus = nimetus;
        this.hind = hind;
    }

    private double hind;
}
