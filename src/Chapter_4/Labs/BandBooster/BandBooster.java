package Chapter_4.Labs.BandBooster;

public class BandBooster {

    private String name;
    private int boxesSold;

    public BandBooster(String name) {
        this.name = name;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int moreBoxesSold) {
        boxesSold += moreBoxesSold;
    }

    public String toString() {
        return name + ": " + boxesSold + " boxes";
    }
}
