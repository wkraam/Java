public class TestRaamat {
    public static void main(String[] args) {
        Raamat kevade = new Raamat("Oskar Luts", "kevade");
        Raamat[] riiul = new Raamat[100];
        System.out.println(riiul[8]);
        riiul[8] = kevade;
        System.out.println(riiul[8].toString());

        String autor = "Eduard Vilde";

        for (int i = 0; i < riiul.length; i++) {
            riiul[i] = new Raamat(autor, "Kogutud teosed " + String.valueOf(i + 1));
        }

        System.out.println("10. raamat riiulil on " + riiul[51] + ".");
    }
}
