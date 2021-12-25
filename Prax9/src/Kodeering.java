import java.io.*;


public class Kodeering {
    public static void kodeeringud(String word) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("codes.txt"), "windows-1257"))){
            bw.write(word);
        }catch(Exception ex){
            System.out.println("Fataalne viga!");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("codes.txt"), "windows-1257"))) {
            // faili kasutamine
            System.out.println(br.readLine());
        }catch(Exception ex){}
    }

    public static void main(String[] args) {
        kodeeringud("Andje käsi väsis ärä, võtje käsi ei väsi kunagi");
    }
}
