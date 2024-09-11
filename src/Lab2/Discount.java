package src.Lab2;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        double fixedPrice = -1.0;
        int discount = 0, quantity = -1;

        Scanner input = new Scanner(System.in);

        while (fixedPrice < 0) {
            System.out.print("Fixed price: $");
            fixedPrice = input.nextDouble();
        }

        while (quantity < 0) {
            System.out.print("Quantity: ");
            quantity = input.nextInt();
        }

        input.close();

        if (quantity >= 2)
            discount += 20;
        if (quantity >= 6)
            discount += 10;
        if (quantity >= 11)
            discount += 10;

        double discounted = fixedPrice * (1 - (discount / 100.0));
        System.out.println("Discount: " + discount + "%");
        System.out.println(String.format(
                "Discounted price: $%.2f with discounted amount per unit: $%.2f from the original price of $%.2f",
                discounted, fixedPrice - discounted, fixedPrice));
        System.out.println(
                String.format("Final total price: $%.2f * %d = $%.2f", discounted, quantity,
                        discount * (double) quantity));
    }
}
