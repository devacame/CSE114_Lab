package src.Lab5;

import java.util.Scanner;

public class CarInsurance {

    private static double premiumPercentage(int age, String gender) {
        if (age < 18) return -1.0;
        if (age < 21) {
            if (gender.equals("Male")) return 1.0;
            return 0.9;
        }
        if (age < 30) return 0.75;
        if (age < 60) {
            if (gender.equals("Male")) return 0.6;
            return 0.7;
        }
        return 1.0;
    }
    public static void main(String args[]) {
        double premium =  -1.0;
        int age = -1;
        String gender = "";
        Scanner input = new Scanner(System.in);
        while (premium < 0.0) {
            System.out.print("Please enter in the premium price of the auto insurance policy: ");
            premium = input.nextDouble();
        }
        while (age < 0) {
            System.out.print("Please enter in the person's age: ");
            age = input.nextInt();
        }
        while (gender == "") {
            System.out.print("Please enter in either Male of Female for gender: ");
            gender = input.next();
        }
        input.close();
        double percentage = premiumPercentage(age, gender);
        System.out.println("Premium: " + (percentage < 0.0 ? percentage : premium*percentage));
    }
}
