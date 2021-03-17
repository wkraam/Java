public class TestSeade {
    public static void main(String[] args) {
        Seade pesumasin = new Seade(6789230, "Bosch pesumasin", 100);
        Seade telekas = new Seade(782379234, "LG teler", 267);

        System.out.println(pesumasin.toString());
        System.out.println("Hind koos käibemaksuga: "+ pesumasin.kmhind());
        System.out.println("Käibemaksuprotsent on: "+pesumasin.getKäibemaksuProtsent());
        System.out.println("Muudame kmprotsendi 40% peale.");
        pesumasin.setKäibemaksuProtsent(0.4);
        System.out.println("Hind koos käibemaksuga: "+ pesumasin.kmhind());

        System.out.println(telekas.toString());
        System.out.println("Hind koos käibemaksuga: "+ telekas.kmhind());
        System.out.println("teleka kood on: "+telekas.getKood());
    }
}
