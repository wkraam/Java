public class Reis {
    private String destination;
    private int distToDest; //in km
    private int soldTickets;
    private Lennuk plane = new Lennuk();

    public Reis(String destination, int distToDest, int soldTickets, Lennuk plane) {
        this.destination = destination;
        this.distToDest = distToDest;
        this.soldTickets = soldTickets;
        this.plane = plane;
    }

    public String getDestination() {
        return destination;
    }

    public int getDistToDest() {
        return distToDest;
    }

    public int getSoldTickets() {
        return soldTickets;
    }

    public Lennuk getPlane() {
        return plane;
    }

    public int ETT(){
        return (int) ((distToDest/(plane.getAvgSpeed()*1.85200))*60);
    }

    public int freePax(){
        return plane.getMaxPax()-soldTickets;
    }

    public String toString(){
        return plane.getName()+" has sold "+soldTickets+" tickets to "+destination+" and has "+freePax()+" free seats. The distance to destination is "+distToDest+" and the estimated time of travel is "+ETT()+" minutes";
    }
}
