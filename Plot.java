package ApexConstructionPrivateLimited;
/*
@author Deepak Dangi
*/
public class Plot {

    private String sectorName;
    private double length;
    private double breadth;

    public Plot() {
        this.sectorName = "A";
        this.length = 50;
        this.breadth = 20;
    }

    public Plot(double length) {
        this.sectorName = "B";
        this.length = length;
        this.breadth = 50;
    }

    public Plot(double length, double breadth) {
        this.sectorName = "C";
        this.length = length;
        this.breadth = breadth;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getPlotArea() {
        return length * breadth;
    }

}
