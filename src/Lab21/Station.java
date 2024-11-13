package Lab21;

public class Station {
    private double myBasePrice;
    private Pump[] myPumps;

    public Station(double myBasePrice, Pump[] myPumps) {
        this.myBasePrice = myBasePrice;
        this.myPumps = myPumps;
    }

    public double totalSales() {
        double total = 0.0;
        for (int i = 0; i < myPumps.length; i++) {
            total += myPumps[i].gallonsSold() * (myBasePrice + (i < 2 ? 0.25 : 0));
        }
        return total;
    }

    public void resetAll() {
        for (Pump pump : myPumps) {
            pump.resetGallonsSold();
        }
    }

    public double closeStation() {
        double total = totalSales();
        resetAll();
        return total;
    }

    public static void main(String[] args) {
        Pump[] myPumps = new Pump[4];
        myPumps[0] = new Pump();
        myPumps[1] = new Pump();
        myPumps[2] = new Pump();
        myPumps[3] = new FixedCapacityPump(5.0);
        myPumps[0].sellGallons(5.3);
        myPumps[1].sellGallons(2.5);
        myPumps[2].sellGallons(6.0);
        myPumps[3].sellGallons(3.4);

        Station station = new Station(2.00, myPumps);
        System.out.println(station.totalSales());
        station.resetAll();
        System.out.println(station.totalSales());
        myPumps[0].sellGallons(2.5);
        myPumps[1].sellGallons(5.67);
        myPumps[2].sellGallons(3.25);
        myPumps[3].sellGallons(6.8);
        System.out.println(station.closeStation());
    }
}
