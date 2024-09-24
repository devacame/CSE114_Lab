package src.Lab9;

import java.util.Scanner;

public class AreaOfTriangle {
    public static double areaOfTriangle(double base, double height) {
        return base * height * 0.5;
    }
    public static void main(String[] args) {
        double base = -1.0, height = -1.0;
        Scanner input = new Scanner(System.in);
        while (base < 0.0 && height < 0.0) {
            System.out.print("Enter the values of base and height: ");
            base = input.nextDouble(); height = input.nextDouble();
        }
        input.close();
        System.out.printf("Area of this triangle with base %f and height %f is %f.\n", base, height, areaOfTriangle(base, height));
    }
}
