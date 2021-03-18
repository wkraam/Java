public class Rott extends Närilised{
    private String hääl = "ma olen rott";
    @Override
    public void häälitse(){
        System.out.println(hääl);
        super.hääled.add(hääl);
    }

    @Override
    public String toString(){
        return "rott";
    }
}
