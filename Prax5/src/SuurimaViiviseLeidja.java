public class SuurimaViiviseLeidja implements Kontrollija{
    private String laenutaja;
    private String teoseKirjeldus;
    private double suurimViivis;

    public SuurimaViiviseLeidja() {
        this.suurimViivis = 0;
    }

    void saadaHoiatus(){
        System.out.println(laenutaja+", "+teoseKirjeldus);
    }

    @Override
    public void salvestaViivis(String laenutajaNimi, String teoseKirjeldus, double viiviseSuurus){
        if (viiviseSuurus>suurimViivis){
            this.laenutaja = laenutajaNimi;
            this.teoseKirjeldus = teoseKirjeldus;
            this.suurimViivis = viiviseSuurus;
        }
    }
}
