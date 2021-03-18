public class Lauatelefon extends Telefon{
    private String asukoht;

    @Override
    public String tähtisInfo() {
        return asukoht;
    }

    public Lauatelefon(String number, String helin, String asukoht) {
        super(number, helin);
        this.asukoht = asukoht;
    }

    public String toString(){
        return super.toString()+" asukoht: "+asukoht;
    }
}
