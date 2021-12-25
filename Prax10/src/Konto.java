public class Konto {
    private String nimi;
    private double raha;

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setRaha(double raha) throws NegatiivneSummaErind {
        if (raha < 0 ) throw new NegatiivneSummaErind("Ei saa panna raha negatiivseks");
        this.raha = raha;

    }

    public Konto(String nimi, double raha) throws NegatiivneSummaErind {
        setNimi(nimi);
        if (raha < 0 ) throw new NegatiivneSummaErind("Ei saa luua kontot negatiivse rahaga");
        setRaha(raha);
    }

    public void osta(double maksumus) throws RahaEiJätkuErind, NegatiivneSummaErind {
        if (raha-maksumus<0) throw new RahaEiJätkuErind("Panga kontol pole piisavalt raha, kontol on: "+raha+" aga maksumus: "+maksumus);
        setRaha(raha-maksumus);
    }

    public void paneJuurde(double summa) throws NegatiivneSummaErind {
        if (summa<0) throw new NegatiivneSummaErind("Juurde ei saa panna negatiivse summat!");
        setRaha(raha+summa);
    }

    @Override
    public String toString() {
        return "Konto{" +
                "nimi='" + nimi + '\'' +
                ", raha=" + raha +
                '}';
    }

    public static void main(String[] args) throws NegatiivneSummaErind, RahaEiJätkuErind {
        Konto konto = new Konto("Ats", 560);
        konto.osta(400);
        konto.paneJuurde(5-2);
        System.out.println(konto);
    }
}
