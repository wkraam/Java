public class B extends A{
    private int b;

    public B(int a, int b) {
        super(a);
        this.b = b;
    }

    void meetoda(){
        System.out.println("Olen B isend, a = " + a);
    }
    void meetodb(){
        System.out.println("Olen B isend, b = " + b);
    }
}
