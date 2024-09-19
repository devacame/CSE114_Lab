package src.Lab7;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        int in, cntPos = 0, cntNeg = 0, total = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter integer: ");
            in = input.nextInt();
            if (in == 0) break;
            if (in > 0) cntPos++;
            else cntNeg++;
            total += in;
        }
        input.close();
        System.out.printf("%d Postivie numbers and %d Negative numbers with the average of %f\n", cntPos, cntNeg, (double)total/(cntPos+cntNeg));
    }
}
