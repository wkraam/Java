import java.util.*;

public class Loosiratas {
    public List<Külastaja> külastajad = new ArrayList<>();

    void lisaKülastaja (Külastaja külastaja){

    }
    void lisaKülastaja (String külastajaNimi, int külastusteArv){

    }

    public List<Külastaja> kõigeAktiivsemad(int n){
        List<Külastaja> parimad = new ArrayList<>();
        List<Külastaja> sorteeritudList = new ArrayList<>();
        if (külastajad.size() <= n){
            return külastajad;
        } else if (külastajad.size() > n){
            Collections.sort(külastajad, Collections.reverseOrder());
            for (Object inimene:külastajad){
                System.out.println(inimene);
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                //parimad.add(Külastaja[i]);
            }
            return parimad;
        }
        return null;
    }
    public Külastaja loosiVõitja(){
        Random rand = new Random();
        int random = rand.nextInt(3);
        return null;
    }
}
