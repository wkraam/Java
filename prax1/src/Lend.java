public class Lend {
    public static void main(String[] args) {
        Lennuk F50 = new Lennuk("F50", 250, 46);
        Lennuk BN2 = new Lennuk("BN-2", 120, 9);
        Lennuk A320 = new Lennuk();
        Reis TLL_IST = new Reis("Istanbul Airport(IST)", 2037, 23, F50);
        Reis TLL_DME = new Reis("Moscow Domodedovo Airport(DME)", 901, 5, BN2);
        Reis MUC_DXB_F50 = new Reis("Dubai International Airport(DBX)", 4568, 46, F50);
        Reis MUC_DXB_A320 = new Reis("Dubai International Airport(DBX)", 4568, 146, A320);

        System.out.println(TLL_DME.toString());
        System.out.println(TLL_IST.toString());
        System.out.println(MUC_DXB_F50.toString());
        System.out.println(MUC_DXB_A320.toString());
        System.out.println(TLL_DME.ETT() + " is the time in minutes to travel from TLL to DME");
        System.out.println(MUC_DXB_A320.freePax() + " free seats on A320");
        System.out.println(A320.getMaxPax() + " is the maximum number of seats in A320");
        A320.setMaxPax(240);
        System.out.println("adding 20 seats to A320");
        System.out.println(A320.getMaxPax() + " is the maximum number of seats in A320");
    }
}
