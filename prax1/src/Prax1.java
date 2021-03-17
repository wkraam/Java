import java.sql.SQLOutput;
import java.util.Scanner;

public class Prax1 {
    static double aritkeskmine(double arv1, double arv2) {
        double summa = arv1 + arv2;
        return summa / 2;
    }

    static boolean kolmnurgaKüljed(double x,double y,double alus){
        double hyp = 0d;
        x = Math.pow(x, 2);
        y = Math.pow(y, 2);
        hyp = x+y;
        System.out.println(hyp);
        if (alus < hyp){
            return true;
        } else {
            return false;
        }


    }
    public static void main(String[] args) {
        double a = 1.5;
        double b = 2.25;
        double c = aritkeskmine(a, b);
        if (b > a) {
            System.out.println("Arvude " + a + " ja " + b + " aritmeetiline keskmine on " + c);
        } else {
            System.out.println("Arvude 3.4 ja -3.4 aritmeetiline keskmine on " + aritkeskmine(-3.4, 3.4));
        }

        int nädalapäev = 5;
        //switch
        switch (nädalapäev) {
            case 1:
                System.out.println("Esmaspäev");
                break;
            case 2:
                System.out.println("Teisipäev");
                break;
            case 3:
                System.out.println("Kolmapäev");
                break;
            case 4:
                System.out.println("Neljapäev");
                break;
            case 5:
                System.out.println("Reede");
                break;
            case 6:
                System.out.println("Laupäev");
                break;
            case 7:
                System.out.println("Pühapäev");
                break;
            default:
                System.out.println("Vigane päev");
        }

        //for tsükkel
        for (int i = 0; i < 3; i++) {
            System.out.println("For tsükkel " + (i + 1));
        }
        //while tsükkel
        int i = 0;
        while (i < 3) {
            i++;
            System.out.println("While tsükkel " + i);
        }

        //A4 for osa
        int summaFor = 0;
        for (int j = 1; j < 6; j++) {
            summaFor = summaFor + j;
        }
        System.out.println(summaFor);

        //A4 while osa
        int summaWhile = 0;
        i = 1;
        while (i < 6) {
            summaWhile = summaWhile + i;
            i++;
        }
        System.out.println(summaWhile);

        //A4 do-while osa
        int summaDoWhile = 0;
        i = 1;
        do {
            summaDoWhile = summaDoWhile + i;
            i++;
        }
        while (i < 6);
        System.out.println(summaDoWhile);


        Scanner scan = new Scanner(System.in);
        int arv = scan.nextInt();
        System.out.println(arv);
        //A5
        for (int j = 0; j < 5; j++) {
            System.out.println(j + 1);
        }
        //A5 summa-piir
        int summa = 0;
        int piir = 10;
        while (summa < piir) {
            summa += 2;
        }
        System.out.println("summa-piir ül täidetud");
        //A5 do-while
        do {
            System.out.println("Tuletan meelde, et varsti algab loeng!");
        }
        while (false);
        System.out.println("do-while täidetud");

        //A6
        System.out.println("sisesta kolmnurga kaks külge ja alus");
        double sisendA = scan.nextDouble();
        double sisendB = scan.nextDouble();
        double sisendC = scan.nextDouble();
        if (kolmnurgaKüljed(sisendA, sisendB, sisendC)){
            System.out.println("Kolmnurk on tehtav");
        } else {
            System.out.println("Kolmnurk ei ole tehtav");
        }
        //A7
        System.out.println("sisesta TÄISarv: ");
        while(true){
            int sisendarv = scan.nextInt();
            if (sisendarv == 0) {
                break;
            } else if(sisendarv%2 == 0 ) {
                System.out.println("on paarisarv");
            } else {
                System.out.println("ei ole paarisarv");
            }
        }
        //A8
        System.out.println("sisesta tabeli algus, samm ja lõpp");
        int algus = scan.nextInt();
        int samm = scan.nextInt();
        int lõpp = scan.nextInt();
        System.out.println("Kg"+"\t"+"Nael");
        for (int j = algus; j <= lõpp; j+=samm) {
            System.out.print(j+"\t");
            System.out.printf("%.1f", j*2.20462262185 );
            System.out.println();
        }
        //A9
        double summaA9= 0d;
        System.out.println("sisesta korduste arv");
        int lõppA9 = scan.nextInt();
        for (int j = 1; j < lõpp; j+=2) {
            summaA9 += j/j+2;
        }
        System.out.println(summaA9);
    }
}