import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Aritmeetika {
    public static void main(String[] args) throws FileNotFoundException {
        OutputStream output = new FileOutputStream("systemout.txt");
        PrintStream printout = new PrintStream(output);
        System.setOut(printout);
        System.out.println(f1(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

    }
    private static double f1(int a, int b) {

        return a/b;
    }
}
