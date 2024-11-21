package Lab23;

public class HourlyEmployee extends Employee {
    private double hours, wage;

    public HourlyEmployee(String name, String id, double hours, double wage) {
        super(name, id);
        this.hours = hours;
        this.wage = wage;
    }

    public double earnings() {
        return hours * wage;
    }

    public String toString() {
        return super.toString() + " earns $" + earnings() + " per week.";
    }
}
