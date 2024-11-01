package Lab17;

public class Faculty extends Employee {
    private String officeHours;
    private int rank;

    Faculty(String name, String address, String phoneNumber, String email, int age, double salary, java.util.Date MyDate, String officHours, int rank) {
        super(name, address, phoneNumber, email, age, salary, MyDate);
        this.officeHours = officHours;
        this.rank = rank;
    }

    public int salaryRange() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(MyDate);
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int basis = rank * (currentYear - calendar.get(java.util.Calendar.YEAR));
        if (basis < 10) return 1;
        if (basis < 20) return 2;
        return 3;
    }

    public String toString() {
        return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank + "\nSalary Range: " + salaryRange();
    }
}
