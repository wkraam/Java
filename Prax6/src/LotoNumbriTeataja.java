import java.util.Random;

public class LotoNumbriTeataja extends Raadiosaatja{
    public String randNum = "";
    public void loosiJaEdasta(){
        int transmissionLen = 10;
        Random random = new Random();

        for (int i = 0; i < transmissionLen; i++) {
            randNum += random.ints(0, 101).findFirst().getAsInt(); //https://www.baeldung.com/java-generating-random-numbers-in-range
            randNum += " ";
        }
        super.edasta(randNum);
    }
}
