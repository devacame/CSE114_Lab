package Lab17;

public class Employee extends Person {
    protected double salary;
    protected java.util.Date MyDate;

    Employee(String name, String address, String phoneNumber, String email, int age, double salary, java.util.Date MyDate) {
        super(name, address, phoneNumber, email, age);
        this.salary = salary;
        this.MyDate = MyDate;
    }

    public String toString() {
        return super.toString() + "\nSalary: " + salary + "\nDate Hired: " + MyDate.toString();
    }
}
