import java.util.Scanner;

public class Pilt {
    private int laius; //x
    private int kõrgus; //y
    private int[][] pilt;

    public Pilt(int laius, int kõrgus) {
        this.laius = laius;
        this.kõrgus = kõrgus;
        this.pilt = new int[laius][kõrgus];
        for (int i = 0; i < laius; i++) {
            for (int j = 0; j < kõrgus; j++) {
                pilt[i][j] = 255;
            }
        }
    }

    public void määraPiksel(int x, int y, int uusVäärtus){
        pilt[x][y] = uusVäärtus;
    }

    public int annaPiksel(int x, int y){
        return pilt[x][y];

    }

    public int getLaius() {
        return laius-1;
    }

    public int getKõrgus() {
        return kõrgus-1;
    }

    public static void main(String[] args) {
        Pilt pilt1 = new Pilt(10, 10);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("sisesta valik!");
            System.out.println("1-muuda piksli värvi");
            System.out.println("2-anna piksli värv");
            System.out.println("3-lõpeta");
            if (sc.hasNext()){
                int sisend = sc.nextInt();
                if (sisend==1) {
                    while(true) {
                        try {
                            System.out.print("sisesta x: ");
                            int x = sc.nextInt();
                            if (x < 0 || x > pilt1.getLaius()) throw new VigaseKoordinaadiErind("Vale x koordinaat!");

                            System.out.print("Sisesta y: ");
                            int y = sc.nextInt();
                            if (y < 0 || y > pilt1.getKõrgus()) throw new VigaseKoordinaadiErind("Vale y koordinaat!");

                            System.out.print("Sisesta piksli väärtus 0-255: ");
                            int väärtus = sc.nextInt();
                            pilt1.määraPiksel(x, y, väärtus);
                            break;

                        } catch (VigaseKoordinaadiErind e) {
                            System.out.println(e);
                            continue;
                        } catch (VigaseVärviErind e) {
                            System.out.println("See värv mulle ei meeldi, hakka otsast peale!");
                            System.exit(-1);
                        }
                    }
                }
                if (sisend == 2) {
                    while (true) {
                        try {
                            System.out.print("sisesta x: ");
                            int x = sc.nextInt();
                            if (x < 0 || x > pilt1.getLaius()) throw new VigaseKoordinaadiErind("Vale x koordinaat!");

                            System.out.print("Sisesta y: ");
                            int y = sc.nextInt();
                            if (y < 0 || y > pilt1.getKõrgus()) throw new VigaseKoordinaadiErind("Vale y koordinaat!");

                            System.out.println(pilt1.annaPiksel(x, y));
                            break;
                        } catch (VigaseKoordinaadiErind e) {
                            System.out.println(e);
                            continue;
                        }
                    }
                }
                if (sisend == 3) System.exit(0);
            }
        }
    }
}
