package src.Lab3;
import java.util.Scanner;

public class ChangeMaker {
    public static void main(String[] args) {
        double amount = -1.0;
        int inCents, rem, dollars, qs, ds, ns, ps;
        Scanner input = new Scanner(System.in);
        while (amount < 0) {
            System.out.print("Input Amount: $");
            amount = input.nextDouble();
        }
        input.close();
        inCents = (int) (amount * 100);
        dollars = inCents / 100;
        rem = inCents % 100;
        qs = rem / 25;
        rem = rem % 25;
        ds = rem / 10;
        rem = rem % 10;
        ns = rem / 5;
        rem = rem % 5;
        ps = rem;
        System.out.println(dollars + " dollars, " + qs + " quarters, " + ds + " dimes, " + ns + " nickels, and " + ps
                + " pennies.");
    }
}
