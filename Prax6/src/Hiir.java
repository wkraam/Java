public class Hiir extends Närilised{
    private String hääl = "Piiks, piiks";
    @Override
    public void häälitse(){
        System.out.println(hääl);
        super.hääled.add(hääl);
    }

    @Override
    public String toString(){
        return "hiir";
    }
}
