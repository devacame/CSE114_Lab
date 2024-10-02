package src.Lab10;

import java.util.Scanner;

public class BusinessStats {
    private static double mean(double[] arr) {
        double mean = 0;
        for (double ele: arr) {
            mean += ele;
        }
        mean /= arr.length;
        return mean;
    }

    private static double deviation(double[] arr) {
        double mean = mean(arr), deviation = 0;
        for (double ele: arr) {
            deviation += (ele-mean)*(ele-mean);
        }
        deviation = Math.sqrt(deviation / (arr.length-1));
        return deviation;
    }
    public static void main(String[] args) {
        double[] ip = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i=0;i<10;i++) {
            ip[i] = input.nextDouble();
        }
        input.close();
        System.out.println("The mean is " + mean(ip));
        System.out.println("The standard deviation is " + deviation(ip));
    }
}
