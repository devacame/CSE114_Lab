package Lab18;

public class Vehicle {
    protected String name;
    protected int numberOfWheels;

    Vehicle() {
        name = "Vehicle";
        numberOfWheels = 0;
    }

    Vehicle(String name, int numberOfWheels) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String toString() {
        return "Vehicle Owner: " + this.name + "\nNumber of Wheels: " + this.numberOfWheels;
    }

    public boolean equals(Vehicle vehicle) {
        return this.name.equals(vehicle.getName()) && this.numberOfWheels == vehicle.getNumberOfWheels();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);
        vehicle.setName("Car");
        vehicle.setNumberOfWheels(4);
        System.out.println(vehicle);
        Vehicle vehicle2 = new Vehicle("Bike", 2);
        System.out.println(vehicle2);
        System.out.println(vehicle.equals(vehicle2));
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle);
        bicycle.setName("Bicycle");
        bicycle.setNumberOfWheels(2);
        System.out.println(bicycle);
        Bicycle bicycle2 = new Bicycle("Mountain Bike");
        System.out.println(bicycle2);
        System.out.println(bicycle.equals(bicycle2));
        MotorizedVehicle motorizedVehicle = new MotorizedVehicle();
        System.out.println(motorizedVehicle);
        motorizedVehicle.setName("Car");
        motorizedVehicle.setNumberOfWheels(4);
        motorizedVehicle.setEngineVolumeDisplacement(2.0);
        System.out.println(motorizedVehicle);
        MotorizedVehicle motorizedVehicle2 = new MotorizedVehicle("Truck", 4, 10);
        System.out.println(motorizedVehicle2);
        System.out.println(motorizedVehicle.equals(motorizedVehicle2));
    }
}