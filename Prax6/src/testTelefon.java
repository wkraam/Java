import java.util.Arrays;

public class testTelefon {
    public static void main(String[] args) {
        Telefon mobiil1 = new Mobiiltelefon("55647289", "helista mulle mobiilile", true, "Pille");
        Telefon lauatelefon = new Lauatelefon("75365262", "ring ring", "Keila");
        Telefon lauatelefon2 = new Lauatelefon("75365265", "ring ring", "Keila");
        Object[] telefon = {mobiil1, lauatelefon, lauatelefon2};
        Arrays.sort(telefon);
        for (Object telo:telefon) {
            System.out.println(telo);
        }
    }
}
