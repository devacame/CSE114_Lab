package src.Lab12;

import java.util.Scanner;

public class SumColumn {
    private static double sumColumn(double[][] m, int c) {
        double sum = 0;
        for (int i=0;i<m.length;i++) {
            sum += m[i][c];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimensions of an n x m matrix: ");
        int n = input.nextInt(), m = input.nextInt();
        double[][] matrix = new double[n][m];
        System.out.println("Enter the matrix of " + n + " x " + m + ": ");
        for (int i=0;i<n*m;i++) {
            matrix[i/m][i%m] = input.nextDouble();
        }
        input.close();
        System.out.println("The sums of the columns are:");
        for (int c=0;c<m;c++) {
            System.out.print(sumColumn(matrix, c) + " ");
        }
        System.out.println();
    }
}
