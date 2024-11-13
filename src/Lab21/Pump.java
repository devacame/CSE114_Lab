package Lab21;

public class Pump {
    double gallons;

    public Pump() {
        gallons = 0.0;
    }

    public double gallonsSold() {
        return gallons;
    }

    public void resetGallonsSold() {
        gallons = 0.0;
    }

    public void sellGallons(double sold) {
        gallons += sold;
    }
}