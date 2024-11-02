package Lab18;

public class Bicycle extends Vehicle{
    Bicycle() {
        name = "Bicycle";
        numberOfWheels = 2;
    }

    Bicycle(String name) {
        super(name, 2);
    }

    public String toString() {
        return "Bicycle Owner: " + this.name + "\nNumber of Wheels: " + this.numberOfWheels;
    }

    public boolean equals(Bicycle bicycle) {
        return this.name.equals(bicycle.getName()) && this.numberOfWheels == bicycle.getNumberOfWheels();
    }
}
