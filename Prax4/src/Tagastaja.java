public class Tagastaja {
    private String nimi;

    public void Tagastaja(){
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double kogumaksumus(Taara[] taara){
        double tagastusHind=0;
        for (int i = 0; i < taara.length; i++) {
            tagastusHind += taara[i].maksumus();
        }
        return tagastusHind;
    }

    public int tuhjaksJoodud(Taara[] taara){
        int cnt=0;
        for (Taara jooja:taara){

        }
        return 0;
    }

    public String toString(){
        return getNimi();
    }
}
