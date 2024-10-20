package src.Lab13;

import java.util.Scanner;

public class Geometry {
    public static double getTriangleArea(double[][] points) {
        return Math.abs(
            points[0][0]*points[1][1] +
            points[1][0]*points[2][1] +
            points[2][0]*points[0][1] -
            points[1][0]*points[0][1] -
            points[2][0]*points[1][1] -
            points[0][0]*points[2][1]
        ) / 2;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double[][] points = new double[3][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i=0;i<6;i++) {
            points[i/2][i%2] = ip.nextDouble();
        }
        double area = getTriangleArea(points);
        if (area > 0) {
            System.out.println("The area of the triangle is " + area);
        } else {
            System.out.println("The three points are on the same line.");
        }
        ip.close();
    }
}
