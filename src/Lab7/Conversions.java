package src.Lab7;

import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        String option = "";
        double quantity = 0.0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("A - convert pounds to kilos");
            System.out.println("B - convert kilos to pounds");
            System.out.println("C - convert kilometers to miles");
            System.out.println("D - convert miles to kilometers");
            System.out.println("E - convert Celsius to Fahrenheit");
            System.out.println("F - ocnvert Fahrenheit to Celsius");
            System.out.println("G - Exit");
            System.out.print("Enter your option: ");
            option = input.next();
            if (option.equals("G")) break;
            switch (option) {
                case "A":
                    System.out.print("Enter a quantity in pounds: ");
                    quantity = input.nextDouble();
                    System.out.printf("%.2f pounds is %f kgs\n", quantity, quantity*0.45359237);
                    break;
                case "B":
                    System.out.print("Enter a quantity in kilograms: ");
                    quantity = input.nextDouble();
                    System.out.printf("%.2f kgs is %f pounds\n", quantity, quantity/0.45359237);
                    break;
                case "C":
                    System.out.print("Enter a quantity in kilometers: ");
                    quantity = input.nextDouble();
                    System.out.printf("%.2f kms is %f miles\n", quantity, quantity/1.604);
                    break;
                case "D":
                    System.out.print("Enter a quantity in miles: ");
                    quantity = input.nextDouble();
                    System.out.printf("%.2f miles is %f kms\n", quantity, quantity*1.604);
                    break;
                case "E":
                    System.out.print("Enter a quantity in Celsius: ");
                    quantity = input.nextDouble();
                    System.out.printf("%.2f Celsius is %f Fahrenheit\n", quantity, quantity*1.8+32);
                    break;
                case "F":
                    System.out.print("Enter a quantity in Fahrenheit: ");
                    quantity = input.nextDouble();
                    System.out.printf("%.2f Fahrenheit is %f Celsius\n", quantity, (quantity-32)/1.8);
                    break;
            }
        }
        input.close();
        System.out.println("Good bye!");
    }
}
