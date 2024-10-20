package src.Lab14;

import java.util.Scanner;

public class SortRows {
    private static double[] sortRow(double[] r) {
        for (int i=1;i<r.length;i++) {
            double key = r[i];
            int j = i-1;
            while (j >= 0 && r[j] > key) {
                r[j+1] = r[j];
                j--;
            }
            r[j+1] = key;
        }
        return r;
    }
    public static double[][] sortRows(double[][] m) {
        for (int i=0;i<3;i++) m[i] = sortRow(m[i]);
        return m;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double[][] m = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i=0;i<9;i++) m[i/3][i%3] = ip.nextDouble();
        double[][] result = sortRows(m);
        System.out.println("The row-sorted matrix is:");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        ip.close();
    }
}
