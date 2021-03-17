public class IDKaart {
    private String IDKaardiNr;
    private String omanikuNimi;
    private String isikukood;

    public String getIDKaardiNr() {
        return IDKaardiNr;
    }

    public void setIDKaardiNr(String IDKaardiNr) {
        this.IDKaardiNr = IDKaardiNr;
    }

    public String getOmanikuNimi() {
        return omanikuNimi;
    }

    public void setOmanikuNimi(String omanikuNimi) {
        this.omanikuNimi = omanikuNimi;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }

    public IDKaart(String IDKaardiNr, String omanikuNimi, String isikukood) {
        this.IDKaardiNr = IDKaardiNr;
        this.omanikuNimi = omanikuNimi;
        this.isikukood = isikukood;
    }
    public char sugu(){
        int soonumber = Integer.parseInt(isikukood.substring(0,1));
        if (soonumber%2==0){
            return 'N';
        } else return 'N';
    }
    public String sunnikuupaev(){
        int soonumber = Integer.parseInt(isikukood.substring(0,1));
        int sunniAasta = Integer.parseInt(isikukood.substring(1,3));
        int sunniKuu = Integer.parseInt(isikukood.substring(3,5));
        int sunniPaev = Integer.parseInt(isikukood.substring(5,7));
        String Aasta;
        if (soonumber<3){
            Aasta="18"+sunniAasta;
        } else if (soonumber == 3 || soonumber == 4){
            Aasta="19"+sunniAasta;
        }else{
            Aasta="20"+sunniAasta;
        }
        return sunniPaev+"."+sunniKuu+"."+Aasta;
    }
    public String toString(){
        return getOmanikuNimi()+" on sündinud "+sunnikuupaev()+ " ja sugu on: "+sugu();
    }

    public static void main(String[] args) {
        IDKaart pets = new IDKaart("AA133357", "Pets Peeterson", "39904031456");
        System.out.println(pets.toString());
    }
}
