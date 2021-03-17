public class Hekk {
    String nimi;
    Põõsas[] põõsad;

    public Hekk(String nimi, Põõsas[] põõsad) {
        this.nimi = nimi;
        this.põõsad = põõsad;
    }

    public double hekiPikkus(){
        double pikkus = 0d;
        for(Põõsas põõsas:põõsad) {
            pikkus += põõsas.getWidth();
        }
        return pikkus;
    }

    public double kõrgeimPõõsas(){
        double kõrgeim = 0d;
        for (int i = 0; i < põõsad.length; i++) {
            if (põõsad[i].getHeight() > kõrgeim) kõrgeim=põõsad[i].getHeight();
        }
        return kõrgeim;
    }

    public String toString(){
        return "Heki nimi: "+nimi+"; Heki kõrgeim punk: "+kõrgeimPõõsas()+"; Heki kogupikkus: "+hekiPikkus();
    }

    public static void main(String[] args) {
        Põõsas[] hekiPõõsad = new Põõsas[5];
        hekiPõõsad[0] = new Põõsas(1, 3);
        hekiPõõsad[1] = new Põõsas(2, 3);
        hekiPõõsad[2] = new Põõsas(3, 3);
        hekiPõõsad[3] = new Põõsas(4, 3);
        hekiPõõsad[4] = new Põõsas(5, 3);

        Hekk hekk1 = new Hekk("hekk1", hekiPõõsad);
        System.out.println(hekk1.toString());
        for (Põõsas põõsas:
             hekiPõõsad) {
            System.out.println("Põõsas"+põõsas.toString());
        }
    }
}


