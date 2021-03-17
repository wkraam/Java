public class Test {
    public static void main(String[] args) {
        Atraktsioon mäed = new Atraktsioon(12, "Ameerikamäed");
        Atraktsioon loss = new Atraktsioon(14, "Tondiloss");
        Loosiratas loosiratas = new Loosiratas();
        loosiratas.lisaKülastaja(new Külastaja("Pets", 3));
        loosiratas.lisaKülastaja(new Külastaja("Kats", 5));
        loosiratas.lisaKülastaja(new Külastaja("Ly", 7));
        loosiratas.lisaKülastaja(new Külastaja("Fred", 1));
        loosiratas.lisaKülastaja(new Külastaja("Sten", 13));
        Dokument[] dokumendid = {
                new IdKaart("39108071234"),
                new Õpilaspilet(1999)
        };
        System.out.println("sobib: " + mäed.vanusedSobivad(dokumendid));

        for (Dokument dokument: mäed.ebasobivadDokumendid(dokumendid)){
            System.out.println(dokument);
        }
        System.out.println(loosiratas.kõigeAktiivsemad(3));
    }
}