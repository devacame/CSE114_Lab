package src.Lab6;

import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        double latitude1, longitude1, latitude2, longitude2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        latitude1 = input.nextDouble(); longitude1 = input.nextDouble();
        double lat1R = Math.toRadians(latitude1), long1R = Math.toRadians(longitude1);
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        latitude2 = input.nextDouble(); longitude2 = input.nextDouble();
        double lat2R = Math.toRadians(latitude2), long2R = Math.toRadians(longitude2);
        input.close();
        System.out.println("The distance between the two points is " + 6371.01*Math.acos(Math.sin(lat1R)*Math.sin(lat2R) + Math.cos(lat1R) * Math.cos(lat2R) * Math.cos(long1R-long2R)));
    }
}
