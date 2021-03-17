public class StaatilineSegadus {
    private String nimi;
    private double pikkus;

    public StaatilineSegadus(String isikuNimi, double isikuPikkus) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
    }

    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }

    public static void main(String[] args) {
        StaatilineSegadus krõõt = new StaatilineSegadus("Krõõt", 1.87);
        System.out.println("suusakepi pikkus on " + krõõt.suusakepiPikkus());
    }
}
