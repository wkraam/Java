import java.io.*;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class loeArveJaLiida implements Runnable {

    private int summa = 0;
    private String failinimi;
    private BlockingQueue<Integer> tulemused;

    public loeArveJaLiida(String failinimi, BlockingQueue<Integer> tulemused) {
        this.failinimi = failinimi;
        this.tulemused = tulemused;
    }

    @Override
    public void run() {
        try {
            File file = new File(failinimi);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String rida[] = sc.nextLine().split(" ");
                for (String s : rida) {
                    if (s.equals("")) ;
                    else summa += Integer.parseInt(s);
                }

            }
            System.out.println(summa);
            tulemused.put(summa);
        } catch (IOException | InterruptedException e) {
            System.out.println("Vigane nimi või midagi muud!");
        }

    }
}
