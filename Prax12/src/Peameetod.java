import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;


public class Peameetod {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> failinimed = new PriorityBlockingQueue<>();
        BlockingQueue<Integer> tulemused = new PriorityBlockingQueue<>();

        failinimed.add("1.txt");
        failinimed.add("2.txt");
        failinimed.add("3.txt");
        failinimed.add("4.txt");
        failinimed.add("5.txt");

        while (!failinimed.isEmpty()){
            new Thread(new loeArveJaLiida(failinimed.take(), tulemused)).start();
            new Thread(new loeArveJaLiida(failinimed.take(), tulemused)).start();
            new Thread(new loeArveJaLiida(failinimed.take(), tulemused)).start();
        }
        for (Integer integer : tulemused) {
            System.out.println(integer);
        }

    }
}
