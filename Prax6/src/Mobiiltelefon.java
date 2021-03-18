public class Mobiiltelefon extends Telefon{
    private boolean pildistamisVõimalus;
    private String omanikuNimi;

    public Mobiiltelefon(String number, String helin, boolean pildistamisVõimalus, String omanikuNimi) {
        super(number, helin);
        this.pildistamisVõimalus = pildistamisVõimalus;
        this.omanikuNimi = omanikuNimi;
    }

    @Override
    public String tähtisInfo() {
        return omanikuNimi;
    }

    public String toString(){
        return super.toString()+" omaniku nimi: "+omanikuNimi+" pildistamise võimalus: "+pildistamisVõimalus;
    }
}
