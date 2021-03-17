import java.lang.reflect.Array;
import java.util.Arrays;

public class Prax2 {
    public static int[] ühendaMasiivid(int[] masiiv1, int[] masiiv2){
        int[] tagastusMasiiv = new int[masiiv1.length + masiiv2.length];
        for (int i = 0; i < masiiv1.length; i++) {
            tagastusMasiiv[i] = masiiv1[i];
        }
        for (int i = 0; i < masiiv2.length; i++) {
            tagastusMasiiv[i+masiiv1.length] = masiiv2[i];
        }
        Arrays.sort(tagastusMasiiv);
        return tagastusMasiiv;
    }

    public static int[] reverseMassiv(int[] masiiv1){
        int[] tagastusMasiiv = new int[masiiv1.length];
        for (int i = 1; i < masiiv1.length+1; i++) {
            tagastusMasiiv[i-1] = masiiv1[masiiv1.length-i];
        }
        return tagastusMasiiv;
    }
    public static void main(String[] args) {
        int[] m1 = {2, 3, 4, 5, 6};
        int[] m2 = {-1, -10, 34};
        int[] m3 = ühendaMasiivid(m1, m2);
        for (int i = 0; i < m3.length; i++) {
            System.out.print(m3[i]);
            System.out.print(", ");
        }
        int[] m4 = reverseMassiv(m1);
        for (int i = 0; i < m4.length; i++) {
            System.out.print(m4[i]);
            System.out.print(",");
        }
    }
}
