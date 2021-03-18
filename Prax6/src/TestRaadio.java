import java.util.ArrayList;
import java.util.List;

public class TestRaadio {
    public static void main(String[] args) {

        List<String> fakeNews = new ArrayList<>();
        fakeNews.add("Kim J. Unn võttis üle Lõuna-Korea");
        fakeNews.add("Täna on päikesel 10 kraadi külmem");
        fakeNews.add("Malaarja on ravitud");
        fakeNews.add("USA pole enam võlga");
        fakeNews.add("I'm addicted to drugs and alcohol and snus!");
        fakeNews.add("Aafrikas pole enam nälga");


        LotoNumbriTeataja lotoTeataja = new LotoNumbriTeataja();
        valiRaadiosaatja valiRaadio = new valiRaadiosaatja();
        UudiseRaadio uudisteRaadio = new UudiseRaadio();
        uudisteRaadio.uuendaAktuaalsedUudised(fakeNews);
        RaadioKuulaja kuulaja1 = new RaadioKuulaja();
        RaadioKuulaja kuulaja2 = new RaadioKuulaja();
        HajameelneKuulaja kuulaja3 = new HajameelneKuulaja();

        lotoTeataja.lisaKuulaja(kuulaja1);
        uudisteRaadio.lisaKuulaja(kuulaja2);
        uudisteRaadio.lisaKuulaja(kuulaja3);

        lotoTeataja.loosiJaEdasta();
        System.out.println(kuulaja1.meenuta());
        System.out.println(kuulaja2.meenuta());
        System.out.println(kuulaja3.meenuta());

    }
}
