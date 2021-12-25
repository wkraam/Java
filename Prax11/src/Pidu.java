import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class Pidu {
    public static void main(String[] args) throws IOException {

        String path = args[0];
        String külaline = args[1];
        Map<String, String> pidulised = new HashMap<>();

        //piduliste mapi tekitamine
        BufferedReader lugeja = new BufferedReader(new FileReader(path, Charset.forName("UTF-8")));
        String rida;
        while ((rida = lugeja.readLine())!= null){
            String kutsuja = rida.split(" ")[0];
            String kutsud = rida.split(" ")[1];
            pidulised.put(kutsuja, kutsud);
        }

        //algelise kutsuja välja juurimine
        String algelineKutsuja = "ei ole";
        int size = pidulised.size();
        while(size>0) {
            for (String s : pidulised.keySet()) {
                if (pidulised.get(s).matches(külaline)){
                    külaline = s;
                }
            }
            size--;
        }
        System.out.println(külaline);
    }
}
