import java.util.Arrays;

public class tantsupaarid {
    public static void main(String[] args) {
        int[] poistePikkused = {180, 175, 200, 172, 169, 183, 188};
        int[] tüdrukutePikkused = {165, 167, 172, 169, 162};
        Arrays.sort(poistePikkused);
        Arrays.sort(tüdrukutePikkused);
        int[] paarilised = new int[poistePikkused.length+tüdrukutePikkused.length];
        System.out.println(paarilised.length);
        if(poistePikkused.length == tüdrukutePikkused.length){
            //saavad kõik parilised
            for (int i = 0, j=0; i < paarilised.length; i+=2, j++) {
                paarilised[i] = poistePikkused[j];
                paarilised[i+1] = tüdrukutePikkused[j];
            }
            System.out.println("Tantsupaarid on:");
            for (int i = 0; i < paarilised.length; i++) {
                if (paarilised[i] != 0) {
                    System.out.print("(" + paarilised[i++] + "," + paarilised[i] + ")");
                }
            }
            System.out.println();
        } else if(poistePikkused.length > tüdrukutePikkused.length) {
            //pikimad poisid jäävad ilma
            for (int i = 0, j = 0; j < tüdrukutePikkused.length; i+=2, j++) {
                paarilised[i] = poistePikkused[j];
                paarilised[i+1] = tüdrukutePikkused[j];
            }
            System.out.println("Tantsupaarid on:");
            for (int i = 0; i < paarilised.length; i++) {
                if (paarilised[i] != 0) {
                    System.out.print("(" + paarilised[i++] + "," + paarilised[i] + ")");
                }
            }
            System.out.println();
            System.out.println("Ilma jäid:");
            int vahe = poistePikkused.length - tüdrukutePikkused.length;
            for (int i = 0; i < vahe; i++) {
                System.out.print(poistePikkused[poistePikkused.length-(i+1)]);
                if (i+1 < vahe){
                    System.out.print(",");
                }
            }
            System.out.println();
        } else {
            //pikimad tüdrukud jäävad ilma
            for (int i = 0, j = 0; j < poistePikkused.length; i+=2, j++) {
                paarilised[i] = poistePikkused[j];
                paarilised[i+1] = tüdrukutePikkused[j];
            }
            System.out.println("Tantsupaarid on:");
            for (int i = 0; i < paarilised.length; i++) {
                if (paarilised[i] != 0) {
                    System.out.print("(" + paarilised[i++] + "," + paarilised[i] + ")");
                }
            }
            System.out.println();
            System.out.println("Ilma jäid:");
            int vahe = tüdrukutePikkused.length - poistePikkused.length;
            for (int i = 0; i < vahe; i++) {
                System.out.print(tüdrukutePikkused[tüdrukutePikkused.length-(i+1)]);
                if (i+1 < vahe){
                    System.out.print(",");
                }
            }
            System.out.println();

        }
    }

}
