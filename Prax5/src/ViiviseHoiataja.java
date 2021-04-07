import java.util.ArrayList;
import java.util.List;

public class ViiviseHoiataja implements Kontrollija{
    private double lubatudViivis;
    private List<String> hoiatatavadLaenutajad;

    public ViiviseHoiataja(double lubatudViivis) {
        this.lubatudViivis = lubatudViivis;
        this.hoiatatavadLaenutajad = new ArrayList<>();
    }

    @Override
    public void salvestaViivis(String laenutajaNimi, String teoseKirjeldus, double viiviseSuurus){
        if (viiviseSuurus > lubatudViivis){
            if (!hoiatatavadLaenutajad.contains(laenutajaNimi)){
                hoiatatavadLaenutajad.add(laenutajaNimi);
            }
        }
    }

    public List<String> getHoiatatavadLaenutajad() {
        return hoiatatavadLaenutajad;
    }
}
