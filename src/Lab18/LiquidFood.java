package Lab18;

public class LiquidFood extends Food{
    private double viscosity;

    LiquidFood() {
        super();
        this.viscosity = 0;
    }

    LiquidFood(String description, double calories, double viscosity) {
        super(description, calories);
        this.viscosity = viscosity;
    }

    public double getViscosity() {
        return this.viscosity;
    }

    public void setViscosity(double viscosity) {
        this.viscosity = viscosity;
    }

    public String toString() {
        return super.toString() + "\nViscosity: " + this.viscosity;
    }

    public boolean equals(LiquidFood liquidFood) {
        return super.equals(liquidFood) && this.viscosity == liquidFood.viscosity;
    }
}
