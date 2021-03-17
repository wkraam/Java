import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Lastehoid {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Lapsehoidja> lapsehoidjateList = new ArrayList<>();
        ArrayList<Integer> nanyIndexes = new ArrayList<>();
        int nannyIndex;
        int nannyFirmNumber = 35;
        String nannyName = "Jana";
        int repetition = 0;

        File Data = new File("src\\lapsehoidjad.txt");
        try (java.util.Scanner sc = new java.util.Scanner(Data, "UTF-8")) {
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] row = data.split(" ");
                int firmNumber = Integer.parseInt(row[0]);
                lapsehoidjateList.add(new Lapsehoidja(firmNumber, row[1]));
            }
            if (lapsehoidjateList.isEmpty()) lapsehoidjateList.add(new Lapsehoidja(nannyFirmNumber, nannyName));
            for (int i = 0; i < lapsehoidjateList.size(); i++) {
                nanyIndexes.add(lapsehoidjateList.get(i).getFirmNumber());
                //get the index where to put 35th nanny
                if (repetition == 0) {
                    if (lapsehoidjateList.get(i).getFirmNumber() > nannyFirmNumber) {
                        nannyIndex = i;
                        lapsehoidjateList.add(nannyIndex, (new Lapsehoidja(nannyFirmNumber, nannyName)));
                        nanyIndexes.add(nannyFirmNumber);
                        repetition++;
                    }
                    for (int j = 0; j < lapsehoidjateList.size(); j++) {
                        if (lapsehoidjateList.get(j).getFirmNumber() == 46) lapsehoidjateList.remove(j);
                    }
                }
            }
            if (!nanyIndexes.contains(35)) lapsehoidjateList.add(new Lapsehoidja(nannyFirmNumber, nannyName));
            for (int i = 0; i < lapsehoidjateList.size(); i++) {
                System.out.println(lapsehoidjateList.get(i));
            }
        }
    }
}

