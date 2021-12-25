import java.time.LocalDateTime;

public class Arvuti {
    private boolean kiirtöö;
    private String tootja;
    private LocalDateTime registreerimiseAeg;
    private String kirjeldus;

    public Arvuti(String tootja, boolean kiirtöö, LocalDateTime registreerimiseAeg, String kirjeldus) {
        this.kiirtöö = kiirtöö;
        this.tootja = tootja;
        this.registreerimiseAeg = registreerimiseAeg;
        this.kirjeldus = kirjeldus;
    }

    public String getTootja() {
        return tootja;
    }

    public boolean onKiirtöö() {
        return kiirtöö;
    }

    public LocalDateTime getRegistreerimiseAeg() {
        return registreerimiseAeg;
    }

    double arvutaArveSumma(double baashind){
        return 0;
    }

    @Override
    public String toString() {
        return kirjeldus;
    }
}
