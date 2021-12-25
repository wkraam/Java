public class Võrdleja <T extends Comparable<T>>{
    private T võrreldav;

    public Võrdleja(){

    }

    public Võrdleja(T võrreldav) {
        this.võrreldav = võrreldav;
    }

    public T getVõrreldav() {
        return võrreldav;
    }

    public void setVõrreldav(T võrreldav) {
        this.võrreldav = võrreldav;
    }

    /*private T leiaSuurem(T võrreldav, T param2){
        public int compareTo(T param2) {
            if (võrreldav < param2)
                return param2; // negatiivne arv näitab, et this on väiksem kui võrreldav
            if (võrreldav > param2)
                return võrreldav; // positiivne arv näitab, et this on suurem kui võrreldav
            return null; // null tähendab, et mõlemad on võrdsed
        }
    }*/
}
