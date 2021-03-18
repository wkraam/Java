public abstract class Telefon implements Comparable<Telefon> {
    private String number;
    private String helin;

    public String getNumber() {
        return String.valueOf(number);
    }

    public Telefon(String number, String helin) {
        this.number = number;
        this.helin = helin;
    }

    public String getHelin() {
        return helin;
    }

    public abstract String tähtisInfo();

    public String viimasedNumbrid(int n){
        int numbriPikkus = number.length();
        return number.substring(numbriPikkus-n-1,numbriPikkus-1);
    }

    public int compareTo(Telefon võrreldav){
        String viimaneNrSTR = viimasedNumbrid(1);
        int viimaneNr = Integer.valueOf(viimaneNrSTR);
        if (viimaneNr < Integer.valueOf(võrreldav.viimasedNumbrid(1)))
            return -1;
        if (viimaneNr > Integer.valueOf(võrreldav.viimasedNumbrid(1)))
            return 1;
        return 0;
    }

    public String toString(){
        return "number: "+number+" helin: "+helin;
    }
}
