package src.Lab6;

import java.util.Scanner;

public class RegularPolygon {
    public static void main(String[] args) {
        int n = -1;
        double side = -1.0;
        Scanner input = new Scanner(System.in);
        while (n < 0) {
            System.out.print("Enter the number of sides: ");
            n = input.nextInt();
        }
        while (side < 0.0) {
            System.out.print("Enter the side length: ");
            side = input.nextDouble();
        }
        input.close();
        System.out.println("The area of the polygon is " + n*side*side/(4*Math.tan(Math.PI/n)));
    }
}
