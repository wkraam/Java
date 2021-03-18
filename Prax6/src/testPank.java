public class testPank {
    public static void main(String[] args) {
        Klient Peeter = new Klient(3980309, 100, 0);
        Klient Walther = new Klient(3990617, 150, 10);
        Klient Maibrit = new Kuldklient(6220617, 200.0, "maibrit", 467.74);
        Klient Valdo = new Kuldklient(76538, 190999299, "valdo", 77876878);
        KampaaniaKuldklient k = new KampaaniaKuldklient(1, 100, "andrus", 3000);
        System.out.println(Peeter);
        Walther.teostaÜlekanne("Peeter", 20.0);
        Walther.teostaÜlekanne("jah", 1000);
        Walther.teostaÜlekanne("jah", 1000);
        Walther.teostaÜlekanne("jah", 1000);
        Walther.teostaÜlekanne("jah", 1000);
        System.out.println(Peeter);
        System.out.println(Maibrit);
        System.out.println(Walther);
        System.out.println(Walther.arvutaTehinguTasud());
        System.out.println(Maibrit.arvutaTehinguTasud());
        System.out.println(Walther.arvutaPortfelliHaldustasu());
        System.out.println(Maibrit.arvutaPortfelliHaldustasu());
        System.out.println(Valdo.arvutaPortfelliHaldustasu());
        System.out.println(k.toString());
        System.out.println(k);
    }
}
