import java.util.ArrayList;
import java.util.List;

public class TestLõbustuspark {
    public static void main(String[] args) {
        Vaateratas vaateratas = new Vaateratas();
        Kloun kloun = new Kloun("juan");
        Lasketiir lasketiir = new Lasketiir();

        TasulineLõbustus tasulineVaateratas = new TasulineLõbustus(2.25, vaateratas);
        TasulineLõbustus tasulineLasketiir = new TasulineLõbustus(1.5, lasketiir);

        VanuseKontrollija vanusekt = new VanuseKontrollija(10, tasulineLasketiir);

        List<Lõbustus> lõbustused = new ArrayList<>();
        lõbustused.add(tasulineVaateratas);
        lõbustused.add(vanusekt);
        lõbustused.add(new LõbustavKloun(kloun));

        Lõbustuspark lõbustuspark = new Lõbustuspark(lõbustused);
        Külastaja2 mina = new Külastaja2(23);
        Külastaja2 mina9 = new Külastaja2(9);

        lõbustuspark.alustaSeiklust(mina);
        System.out.println("-------------------");
        lõbustuspark.alustaSeiklust(mina9);

    }
}
