import java.util.List;

public class Lõbustuspark{
    private List<Lõbustus> lõbustused;

    public Lõbustuspark(List<Lõbustus> lõbustused) {
        this.lõbustused = lõbustused;
    }

    void alustaSeiklust(Külastaja2 külaline){
        System.out.println("Alustan seiklust");
        for (Lõbustus lõbustus :lõbustused){
            lõbustus.lõbusta(külaline);
        }
        for (String lõbustus: külaline.kõikKirjeldused()){
            System.out.println(lõbustus);
        }
        System.out.println(külaline.kuludeSumma());
    }
}
