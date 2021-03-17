import java.time.LocalDate;

public class Õpilaspilet implements Dokument {
    private int sünniaasta;
    public Õpilaspilet(int sünniaasta) {
        this.sünniaasta = sünniaasta;
    }
    public boolean vanusOnVähemalt(int vanus) {
        return sünniaasta + vanus <= LocalDate.now().getYear();
    }
    public String toString(){
        return "Õpilaspilet sünniaastaga: "+String.valueOf(sünniaasta);
    }
}