public class Omandkorter extends Korter{
    public Omandkorter(double pindala, int hind) {
        super(pindala, hind);
    }
    public int väärtus(){
        return getHind();
    }
}
