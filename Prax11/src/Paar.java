public class Paar {
    public static void main(String[] args) {
        Hoidla<String, Integer> nimiVanus = new Hoidla<>("Juhan", 22);
        Hoidla<String, String> nimiElukoht = new Hoidla<>("Juku", "Teeväljatee 10");
        System.out.println(nimiElukoht);
        System.out.println(nimiVanus);
    }
}
