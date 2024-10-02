package src.Lab11;

public class Tuition {
    public static void main(String[] args) {
        double tuitionInTenYears = 10000*Math.pow(1.05, 10);
        System.out.printf("Tuition in 10 years with initial tuition of $10,000 is $%,.2f and four years worth of tuition is $%,.2f\n", tuitionInTenYears, tuitionInTenYears*4);
    }
}
