public class Raamat {
    private String autor;
    private String pealkiri;

    public Raamat(String autor, String pealkiri) {
        this.autor = new Isik(autor,100).getNimi();
        this.pealkiri = pealkiri;
    }

    public String toString(){
        return autor+" - "+pealkiri;
    }

}
