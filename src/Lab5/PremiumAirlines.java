package src.Lab5;

import java.util.Scanner;

public class PremiumAirlines {
    public static void main(String args[]) {
        String membership = "";
        int price = -1, points = -1;
        Scanner input = new Scanner(System.in);
        while (membership == "") {
            System.out.print("Please enter membership (Diamond/Platinum/Regular): ");
            membership = input.next();
        }
        while (price < 0) {
            System.out.print("Please enter ticket price: ");
            price = input.nextInt();
        }
        while (points < 0) {
            System.out.print("Please enter ticket price: ");
            points = input.nextInt();
        }
        input.close();

        if (!membership.equals("Regular") && price >= 5000) points += 35;
        else if (membership.equals("Diamond") && price >= 2000 && points > 300) points += 30;
        else if (membership.equals("Platinum") && price >= 2000) points += 20;
        else if (membership.equals("Diamond") && price >= 500 && points >= 100) points += 10;
        else if (membership.equals("Regular") && price >= 5000) points += 5;
        else if (membership.equals("Diamond") && points >= 25) points += 2;

        System.out.println("Points: " + points);
    }
     
}
