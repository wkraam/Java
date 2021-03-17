public class TestElektriauto {
    public static void main(String[] args) {
        Elektrijaam elektihind = new Elektrijaam(0.15);
        Elektriauto Nissan_Leaf = new Elektriauto("Nissan Leaf", 18.5, 7, 385, elektihind.getElektrihind());
        System.out.println("Laadimise aeg: "+Nissan_Leaf.getLaadimisaeg());
        System.out.println(Nissan_Leaf.toString());
        System.out.println("56km maksumus: "+Nissan_Leaf.maksumus(56));
        System.out.println("56km reisi kestus linnas: "+Nissan_Leaf.reisiKestus(56, 50));
    }
}
