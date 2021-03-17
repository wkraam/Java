public class Viitarv {
    public static void main(String[] args) {
        Arv viitarv1 = new Arv();
        viitarv1.arv = 1608;
        Arv viitarv2 = new Arv();
        viitarv2 = viitarv1;
        viitarv2.arv = 1802;
        System.out.println(viitarv1);
        System.out.println(viitarv2);
    }
}
