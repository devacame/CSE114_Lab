package src.Lab10;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int i1, i2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        i1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        i2 = input.nextInt();
        input.close();
        while (i2 != 0) {
            int temp = i2;
            i2 = i1 % i2;
            i1 = temp;
        }
        System.out.println("The greatest common divisor is: " + i1);
    }
}
