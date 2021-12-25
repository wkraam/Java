import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tsensuur {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            boolean lubatud = true;
            String sisend = br.readLine();
            if (sisend.matches(" ")) break;
            for (String arg: args) {
                if (arg.matches(sisend))lubatud=false;
            }
            if (lubatud) System.out.println(sisend);
        }
    }
}
