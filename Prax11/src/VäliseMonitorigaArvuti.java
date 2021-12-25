import java.time.LocalDateTime;

public class VäliseMonitorigaArvuti extends Arvuti{
    public VäliseMonitorigaArvuti(String tootja, boolean kiirtöö, LocalDateTime registreerimiseAeg, String kirjeldus) {
        super(tootja, kiirtöö, registreerimiseAeg, kirjeldus);
    }
}
