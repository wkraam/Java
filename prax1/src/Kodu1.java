import java.util.Scanner;

public class Kodu1 {

    static int[] generateHeightRange(int low, int high, int numOfChildren){
        int heightArray[] = new int[numOfChildren];
        for (int i = 0; i < numOfChildren; i++) {
            heightArray[i] = randomHeight(low, high);
        }
        return heightArray;
    }

    static int randomHeight(int low, int high) {
        int height = (int) Math.round((Math.random()*(high-low))+low);
        return height;
    }

    //infot kuidas harmoonilist keskmist leida leidsin: https://en.wikipedia.org/wiki/Harmonic_mean
    static float harmonicMean(int[] dataArray){
        float sum = 0.0f;
        for (int i = 0; i < dataArray.length; i++) {
            sum += 1.0/ dataArray[i];
        }
        return dataArray.length/sum;
    }

    static int arvuta(int a, int b){
        return a+b;
    }

    static double arvuta(double a){
        return a+a;
    }

    static void arvuta (int a, String s){
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        //A1
        System.out.println("//A1");
        System.out.println("Look\n" +
                "If you had\n" +
                "One shot\n" +
                "Or one opportunity\n" +
                "To seize everything you ever wanted\n" +
                "In one moment\n" +
                "Would you capture it\n" +
                "Or just let it slip?");
        System.out.println();

        //A2(P1)
        System.out.println("//A2(+,-,*,/,%)");
        int a = 2147483647;
        int b = 5;
        int c = 2;
        int d = 3;
        int e = 19;

        System.out.println(a+b);//miinusesse läheb, kuna ta ületab int piiri
        System.out.println(c-d);
        System.out.println(b*b);
        System.out.println(a/e);
        System.out.println(e%d);
        System.out.println("Arvude " + b + " ja " + c + " summa on " + (b + c));
        //sulgude eemaldamisega ei tehta matemaatilist tehet
        System.out.println("Arvude " + b + " ja " + c + " summa on " + b + c);
        System.out.println(1-0.9);
        System.out.println();

        //A3
        System.out.println("//A3");
        double juhuarv = Math.random();
        System.out.println(juhuarv);
        double reaalJuhuarv = Math.random()*5+15;
        System.out.println(reaalJuhuarv);
        long longJuhuarv = Math.round(Math.random()*5+15);
        System.out.println(longJuhuarv);
        int taisJuhuarv = (int)Math.round(Math.random()*5+15);
        System.out.println(taisJuhuarv);
        int valeJuhuarv = (int)Math.random()*5+15;
        System.out.println(valeJuhuarv);
        System.out.println();

        //P3
        System.out.println("//P3");
        System.out.println(Math.signum(-0.1f)); //tagastab, kas arv on positiivne, negatiivne või 0, see oli mulle võõras meetod
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-1556));
        System.out.println(Math.hypot(Math.E, Math.PI));
        System.out.println();

        //A4
        System.out.println("//A4");
        System.out.println(arvuta(2, 2)); //signatuur: arvuta(int, int)
        System.out.println(arvuta(2.3)); //signatuur: arvuta(double double)
        arvuta(4, "afk"); //signatuur: arvuta(int, String)
        System.out.println();

        //masiivid
        System.out.println("//masiivid");
        int[] masiiv1 ={1, 3, 6, 8, 12};
        double[] masiiv2 = {1.1, 2.4, 54.2, 23.3425, 4.00001};
        System.out.println(masiiv1[1]);
        System.out.println(masiiv1.length);
        System.out.println(masiiv2[3]);
        System.out.println(masiiv2.length);

        int[] masiiv3 = new int[5];
        masiiv3[0] = 3;
        masiiv3[2] = 4;
        System.out.println(masiiv3[1]);
        for (int i = 0; i < masiiv3.length; i++) {
            System.out.print(masiiv3[i]+", ");
        }
        for (double elem : masiiv2) {
            System.out.println(elem);

        }
        System.out.println();

        //A5
        System.out.println("//A5");
        int[] smallChildren = generateHeightRange(60, 100, 10);
        int[] mediumChildren = generateHeightRange(101, 140, 15);
        int[] bigChildren = generateHeightRange(141, 200, 20);
        int[] kids = new int[bigChildren.length + mediumChildren.length + smallChildren.length];
        int kidsPos = 0;

        //prindime kõik välja
        for (int smallChild : smallChildren) {
            System.out.print(smallChild);
            System.out.print(" ");
            kids[kidsPos] = smallChild;
            kidsPos++;
        }
        System.out.println();

        for (int i = 0; i < mediumChildren.length; i++) {
            System.out.print(mediumChildren[i]);
            System.out.print(" ");
            kids[kidsPos] = mediumChildren[i];
            kidsPos++;
        }
        System.out.println();

        for (int bigChild: bigChildren) {
            System.out.print(bigChild);
            System.out.print(" ");
            kids[kidsPos] = bigChild;
            kidsPos++;
        }
        System.out.println();
        System.out.println();

        //prindime kontrollides, kas on üle 80
        for (int smallChild : smallChildren) {
            if (smallChild > 80) {
                System.out.print(smallChild);
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = 0; i < mediumChildren.length; i++)
            if (mediumChildren[i] > 80) {
                System.out.print(mediumChildren[i]);
                System.out.print(" ");
            }
        System.out.println();

        for (int bigChild: bigChildren) {
            if (bigChild > 80) {
                System.out.print(bigChild);
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(harmonicMean(kids));
        System.out.println();

        /*P6/A6
        ekraanile väljastatakse:
        3
        3
        4
        4
        see sellepärast, et kahe järjendi vaheline = näitab, et ta on alati sama, ehk ta viitab, mitte ei ole
        eraldiseisev järjend.
         */
        int[] jarj1 = {1, 3, 6};
        int[] jarj2;
        jarj2 = jarj1;
        System.out.println(jarj1[1]);
        System.out.println(jarj2[1]);
        jarj2[1]=4;
        System.out.println(jarj2[1]);
        System.out.println(jarj1[1]);
        System.out.println();

        /*A7/P7 - BMI calculation
        siin erines eelnevalt käsurealt lugemiselt see, et sisse tuli ka lugeda String
        seda saab rakendada igasugustes programmides, kus on vaja saada kasutaja sisendt,
        parim näide sellest oleks kalkulaator.
         */
        Scanner scan = new Scanner(System.in);
        String firstName;
        double weight;
        double height;
        if (args.length == 0){
            System.out.println("Sisesta eesnimi");
            firstName = scan.next();
            System.out.println("Sisesta kaal");
            weight = scan.nextDouble();
            System.out.println("sisesta pikkus meetrites");
            height = scan.nextDouble();
        } else {
            firstName = args[0];
            weight = Double.parseDouble(args[1]);
            height = Double.parseDouble(args[2]);
        }
        double BMI = 0.0d;
        BMI = weight/Math.pow(height, 2);
        if (BMI < 18.5){
            System.out.println(firstName+" söö rohkem!");
        } else if (BMI > 25) {
            System.out.println(firstName+" kasva lühemaks!");
        } else {
            System.out.println(firstName+" sinuga on kõik hästi!");
        }
    }
}
