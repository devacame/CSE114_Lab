package src.Lab4;

import java.util.Scanner;

public class ComputeEquation {
    public static void main(String args[]) {
        double x = -1.0, y = -1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        x = input.nextDouble();
        System.out.print("Enter the second value: ");
        y = input.nextDouble();
        input.close();
        System.out.println("Equation value: " + (x/(y-3*x)+(x-1)/(y/(x+1))));
    }
}