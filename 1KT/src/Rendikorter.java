public class Rendikorter extends Korter{
    private int hinnang;

    public Rendikorter(double pindala, int hind) {
        super(pindala, hind);
        this.hinnang = (int)((Math.random() * (11 - 6)) + 6);
    }

    public int väärtus(){
        return getHind()*12*15*hinnang/10;
    }

    @Override
    public String toString() {
        return super.toString() +
                "hinnang=" + hinnang
               ;
    }
}
