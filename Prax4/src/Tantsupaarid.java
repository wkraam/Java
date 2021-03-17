public class Tantsupaarid {
    private String poisiNimi;
    private int poisiSuniiaasta;
    private String tudrukuNimi;
    private int tudrukuSunniaasta;

    public Tantsupaarid(String poisiNimi, int poisiSuniiaasta, String tudrukuNimi, int tudrukuSunniaasta) {
        this.poisiNimi = poisiNimi;
        this.poisiSuniiaasta = poisiSuniiaasta;
        this.tudrukuNimi = tudrukuNimi;
        this.tudrukuSunniaasta = tudrukuSunniaasta;
    }

    public String getPoisiNimi() {
        return poisiNimi;
    }

    public void setPoisiNimi(String poisiNimi) {
        this.poisiNimi = poisiNimi;
    }

    public int getPoisiSuniiaasta() {
        return poisiSuniiaasta;
    }

    public void setPoisiSuniiaasta(int poisiSuniiaasta) {
        this.poisiSuniiaasta = poisiSuniiaasta;
    }

    public String getTudrukuNimi() {
        return tudrukuNimi;
    }

    public void setTudrukuNimi(String tudrukuNimi) {
        this.tudrukuNimi = tudrukuNimi;
    }

    public int getTudrukuSunniaasta() {
        return tudrukuSunniaasta;
    }

    public void setTudrukuSunniaasta(int tudrukuSunniaasta) {
        this.tudrukuSunniaasta = tudrukuSunniaasta;
    }

    public String toString(){
        return "Tantsivad "+perenimed();
    }

    public int vanemaPartneriVanus(int jooksevAasta){
        int tudrukuVanus=jooksevAasta-tudrukuSunniaasta;
        int poisiVanus=jooksevAasta-poisiSuniiaasta;
        if (tudrukuVanus>poisiVanus){
            return tudrukuVanus;
        }else{return poisiVanus;}
    }

    public boolean samaSunniaasta(){
        if (tudrukuSunniaasta==poisiSuniiaasta) return true;
        else return false;
    }

    public String perenimed(){
        String poisiPerenimi = poisiNimi.split(" ")[1];
        String tudrukuPerenimi = tudrukuNimi.split(" ")[1];
        return poisiPerenimi+" "+tudrukuPerenimi;
    }
}
