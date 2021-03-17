public class TestIsik {
    public static void main(String[] args) {
        Isik a = new Isik("Juhan Juurikas", 1.99);
        System.out.println("Isik a on " + a);
        a.setNimi("Peeter");
        System.out.println(a.getNimi());
    }
}
