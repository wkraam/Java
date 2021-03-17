public class TestTantsupaarid {
    public static void main(String[] args) {
        Tantsupaarid erikJaAve = new Tantsupaarid("Erik Mand", 1978, "Ave Maasik", 1978);
        Tantsupaarid aoJaMaarika = new Tantsupaarid("Ao Leemekas", 1967, "Maarika Heinla", 1957);
        System.out.println(erikJaAve.getPoisiNimi()+" ja "+erikJaAve.getTudrukuNimi()+ " on sündinud samal aastal: "+erikJaAve.samaSunniaasta());
        System.out.println(aoJaMaarika.getPoisiNimi()+" ja "+aoJaMaarika.getTudrukuNimi()+ " on sündinud samal aastal: "+aoJaMaarika.samaSunniaasta());
        System.out.println("Vanim on sündinud "+aoJaMaarika.vanemaPartneriVanus(2021)+" aastal");
    }
}
