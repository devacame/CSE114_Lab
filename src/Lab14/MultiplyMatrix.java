package src.Lab14;

import java.util.Scanner;

public class MultiplyMatrix {
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] result = new double[3][3];
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<b[0].length;j++) {
                double sum = 0;
                for (int k=0;k<b.length;k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double[][] m1 = new double[3][3], m2 = new double[3][3];
        System.out.println("Enter matrix1: ");
        for (int i=0;i<9;i++) m1[i/3][i%3] = ip.nextDouble();
        System.out.println("Enter matrix2: ");
        for (int i=0;i<9;i++) m2[i/3][i%3] = ip.nextDouble();
        double[][] result = multiplyMatrix(m1, m2);
        System.out.println("Multiplication of the matrices is:");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        ip.close();
    }
}
