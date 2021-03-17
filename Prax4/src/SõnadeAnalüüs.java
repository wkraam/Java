import java.util.ArrayList;

public class SõnadeAnalüüs {
    public static void main(String[] args) {
        String word = "Look if you had one shot or one opportunity";
        String[] wordPieces = word.split(" ");
        System.out.println(word);
        for (int i = 0; i < wordPieces.length; i++) {
            System.out.print(wordPieces[i]+':'+wordPieces[i].length());
            if (i != wordPieces.length){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}
