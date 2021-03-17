import java.time.LocalDate;

public class IdKaart implements Dokument {
    private String isikukood;
    public IdKaart(String isikukood) {
        this.isikukood = isikukood;
    }
    public boolean vanusOnVähemalt(int vanus) {
        int praeguneAasta = LocalDate.now().getYear();
        return sünniaasta() <= praeguneAasta - vanus;
    }
    private int sünniaasta() { // 4. praktikumi 2. harjutus
        int algus = Integer.parseInt(isikukood.substring(0, 1));
        int aasta = Integer.parseInt(isikukood.substring(1, 3));
        if (algus <= 2)
            return 1800 + aasta;
        if (algus <= 4)
            return 1900 + aasta;
        if (algus <= 6)
            return 2000 + aasta;
        return 2100 + aasta;
    }

    public String toString(){
        return "id kaart, isikukoodiga: "+isikukood;
    }
}