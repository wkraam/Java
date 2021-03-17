public class Põõsas {
    private double height;
    private double width;

    public Põõsas(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double projectedOneYearGrow(){
        return (Math.random()*0.1)+getHeight();
    }

    public String toString(){
        return "{Põõsa laius: "+width+"; põõsa kõrgus: "+height+"; põõsa eeldatav aastane kõrgus: "+projectedOneYearGrow()+"}";
    }
}
