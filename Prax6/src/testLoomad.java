public class testLoomad {
    public static void main(String[] args) {
        Loomad loomad = new Loomad();
        Kahepaiksed kahepaiksed = new Kahepaiksed();
        Närilised närilised = new Närilised();
        Konn konn = new Konn();
        Hiir hiir = new Hiir();
        Rott rott = new Rott();
        närilised.lisaLoomad(hiir);
        närilised.lisaLoomad(rott);
        kahepaiksed.lisaLoomad(konn);
        System.out.println(kahepaiksed);
        System.out.println(närilised);
        System.out.println(loomad.getLoomad());
    }
}