public class Fraas {
    private String sõna;

    @Override
    public String toString() {
        return "Fraas{" +
                "sõna='" + sõna + '\'' +
                '}';
    }

    public Fraas(String sõna) throws PalindroomiErind{
        if (onPalindroom(sõna)) throw new PalindroomiErind(sõna+" Fraas on palidroom");
        this.sõna = sõna;
    }

    public boolean onPalindroom(String fraas){
        StringBuilder sb = new StringBuilder(fraas);
        sb.reverse();

        return fraas.equals(sb.toString());
    }

    public static void main(String[] args) throws PalindroomiErind {
        Fraas fr1 = new Fraas("aias sadas saia");
    }
}
