package Lab21;

public class FixedCapacityPump extends Pump {
    private double capacity;

    public FixedCapacityPump(double capacity) {
        super();
        this.capacity = capacity;
    }

    public void sellGallons(double sold) {
        System.out.println("TEst");
        if (gallons + sold > capacity) {
            gallons = capacity;
        } else {
            gallons += sold;
        }
    }
}
