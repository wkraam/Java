public class Konn extends Kahepaiksed{
    private String hääl = "Krooks";

    @Override
    public void häälitse(){
        System.out.println(hääl);
        super.hääled.add(hääl);
    }

    @Override
    public String toString(){
        return "konn";
    }
}
