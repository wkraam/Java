import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lühendaja {

    public static String lühenda(String name){
        String[] splitName = name.split(" ");
        String lastName = "";
        if (splitName.length-1 == 1){
            if (splitName[0].contains("-")){
                String[] splitLastName;
                splitLastName = splitName[0].split("-");
                lastName = splitLastName[0].charAt(0)+"-"+splitLastName[1].charAt(0)+".";
            } else {
                lastName = splitName[0].charAt(0) + ".";
            }
        } else {
            for (int i = 0; i < splitName.length-1; i++) {
                lastName += splitName[i].charAt(0)+". ";
            }
        }
        return splitName[splitName.length-1]+" "+lastName;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File Data = new File("src\\nimed.txt");
        //System.out.println(lühenda("Mari-Liis Suur"));
        Scanner sc = new Scanner(Data);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(lühenda(line));
        }
    }
}
