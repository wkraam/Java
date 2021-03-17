public class Lasketiir implements Lõbustus{
    public void lõbusta(Külastaja2 külastaja){
        külastaja.lisaKirjeldused("tabasin lasketiirus "+(int)Math.random()*((20)+1)+" sihtmärki.");
    }
}