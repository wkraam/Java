public class TestAB {
    public static void main(String[] args) {
        A ab = new B(12, 45);
        ab.meetoda();
        ((B) ab).meetodb();
    }
}
