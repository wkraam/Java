import java.time.LocalDate;

public class Juhiluba{
    private String isikukood;
    public Juhiluba(String isikukood) {
        this.isikukood = isikukood;
    }
    private int kehtivusAasta;
    public Juhiluba(int kehtivusAasta) {
        this.kehtivusAasta = kehtivusAasta;
    }
    public boolean onKehtiv() {
        return kehtivusAasta >= LocalDate.now().getYear();
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
        return isikukood;
    }

}