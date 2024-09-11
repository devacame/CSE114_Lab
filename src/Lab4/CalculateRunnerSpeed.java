package src.Lab4;

import java.util.Scanner;

public class CalculateRunnerSpeed {
    public static void main(String[] args) {
        double distanceRan = -1.0, minutes = -1.0;
        Scanner input = new Scanner(System.in);
        while (distanceRan < 0.0) {
            System.out.print("Input the distance in miles: ");
            distanceRan = input.nextDouble();
        }
        while (minutes < 0.0) {
            System.out.print("Input the time in minutes: ");
            minutes = input.nextDouble();
        }
        input.close();
        System.out.println("Speed: " + distanceRan / (minutes/60));
    }
}
