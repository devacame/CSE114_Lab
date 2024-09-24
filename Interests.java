// 116598178 Hyunwoo(Henry) Ahn
import java.util.Scanner;

public class Interests {
    public static void main(String[] args) {
        double loan = -1.0;
        int years = -1;
        Scanner input = new Scanner(System.in);
        while (loan < 0.0) {
            System.out.print("Loan amount: ");
            loan = input.nextDouble();
        }
        while (years < 0) {
            System.out.print("Number of years: ");
            years = input.nextInt();
        }
        input.close();
        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
        for (double annualInterestRate=5.0;annualInterestRate<8.1;annualInterestRate+=0.125) {
            double monthlyInterestRate = annualInterestRate/1200;
            double monthlyPayment = loan * monthlyInterestRate / (1-Math.pow(1/(1+monthlyInterestRate), years*12));
            double totalPayment = monthlyPayment * years * 12;
            System.out.printf("%.3f%%\t\t%.2f\t\t%.2f\n", annualInterestRate, monthlyPayment, totalPayment);
        }
    }
}
