import java.util.Scanner;

public class Korrutaja {
    public static void main(String[] args) {
        System.out.println("sisesta number:");
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNext()) {
                try {
                    int number = Integer.parseInt(sc.nextLine());
                    System.out.println(number * 2);
                }catch (NumberFormatException e) {
                    System.out.println("Vigane number, palun sisesta uuesti number!");
                }
            }
        }
    }
}
