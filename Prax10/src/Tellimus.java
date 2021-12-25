import java.util.List;

public class Tellimus {
    private String tellija;
    private List<Pitsa> pitsad;
    private int ooteaeg;

    @Override
    public String toString() {
        return "Tellimus{" +
                "tellija='" + tellija + '\'' +
                ", pitsad=" + pitsad +
                ", ooteaeg=" + ooteaeg +
                '}';
    }

    public Tellimus(String tellija, List<Pitsa> pitsad, int ooteaeg) {
        this.tellija = tellija;
        this.pitsad = pitsad;
        this.ooteaeg = ooteaeg;
    }

    public double maksumus() throws LiigaPikkOotamineErind {
        if (ooteaeg>30) throw new LiigaPikkOotamineErind("Liiga pikk ooteaeg, oodata tuleks"+ooteaeg);
        double maksumus = 0;
        for (Pitsa  pitsa: pitsad) {
            maksumus +=pitsa.getHind();
        }
        return maksumus;
    }
}
