import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Peaklass {
    static double tagatisA = 0.04;
    static double tagatisB = 0.08;
    static double tagatisC = 0.08;
    static double tagatisD = 0.08;

    public static void taitja(ArrayList<String> limonaad, ArrayList<Character> pakenditahis, ArrayList<String> joojad) throws FileNotFoundException {
        File anadmed = new File("andmed.txt");
        Scanner scanner = new Scanner(anadmed);
        String rida = scanner.next();
        while(scanner.hasNext()){
            String[] tulemus = rida.split(" ");
            if (tulemus.length==4){
                limonaad.add(tulemus[0]+" "+tulemus[1]);
                joojad.add(tulemus[3]);
                pakenditahis.add(tulemus[2].charAt(0));
            }else{
                limonaad.add(tulemus[0]);
                joojad.add(tulemus[2]);
                pakenditahis.add(tulemus[1].charAt(0));
            }
            rida =scanner.next();
        }


    }

    public static void main(String[] args)throws FileNotFoundException {
        ArrayList<String> limonaad = new ArrayList<>();
        ArrayList<Character> pakenditahis = new ArrayList<>();
        ArrayList<String> joojad = new ArrayList<>();

        taitja(limonaad, pakenditahis, joojad);
        System.out.println(limonaad);
    }
}
