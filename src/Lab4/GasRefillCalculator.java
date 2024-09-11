package src.Lab4;

import java.util.Scanner;

public class GasRefillCalculator {
    public static void main(String args[]) {
        double distance = -1.0, mpg = -1.0, price = -1.0;
        Scanner input = new Scanner(System.in);
        while (distance < 0.0) {
            System.out.print("Enter the distance: ");
            distance = input.nextDouble();
        }
        while (mpg < 0.0) {
            System.out.print("Enter the mpg: ");
            mpg = input.nextDouble();
        }
        while (price < 0.0) {
            System.out.print("Enter the price: ");
            price = input.nextDouble();
        }
        input.close();
        System.out.println("Price for the trip: " + distance/mpg*price);
    }
}
