package Lab17;

public class Staff extends Employee {
    private String title;
    
    Staff(String name, String address, String phoneNumber, String email, int age, double salary, java.util.Date MyDate, String title) {
        super(name, address, phoneNumber, email, age, salary, MyDate);
        this.title = title;
    }

    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
