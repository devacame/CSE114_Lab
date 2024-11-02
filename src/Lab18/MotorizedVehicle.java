package Lab18;

public class MotorizedVehicle extends Vehicle {
    protected double engineVolumeDisplacement;

    MotorizedVehicle() {
        super();
        engineVolumeDisplacement = 0.0;
    }

    MotorizedVehicle(String name, int numberOfWheels, double engineVolumeDisplacement) {
        super(name, numberOfWheels);
        this.engineVolumeDisplacement = engineVolumeDisplacement;
    }

    public double getEngineVolumeDisplacement() {
        return this.engineVolumeDisplacement;
    }

    public void setEngineVolumeDisplacement(double engineVolumeDisplacement) {
        this.engineVolumeDisplacement = engineVolumeDisplacement;
    }

    public double getHorsepower() {
        return this.engineVolumeDisplacement * this.numberOfWheels;
    }

    public String toString() {
        return "Motorized Vehicle Owner: " + this.name + "\nNumber of Wheels: " + this.numberOfWheels + "\nEngine Volume Displacement: " + this.engineVolumeDisplacement + "\nHorsepower: " + getHorsepower();
    }

    public boolean equals(MotorizedVehicle motorizedVehicle) {
        return this.name.equals(motorizedVehicle.getName()) && this.numberOfWheels == motorizedVehicle.getNumberOfWheels() && this.engineVolumeDisplacement == motorizedVehicle.getEngineVolumeDisplacement();
    }
}
