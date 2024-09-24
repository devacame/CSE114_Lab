package src.Lab9;

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        int[] chk = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        System.out.print("Enter numbers: ");
        Scanner input = new Scanner(System.in);
        for (int i=0;i<10;i++) {
            int t = input.nextInt();
            boolean ch = false;
            for (int c : chk) {
                if (c == t) {
                    ch = true;
                    break;
                }
            }
            if (ch) continue;
            System.out.print(t + " ");
            chk[i] = t;
        }
        input.close();
    }
}
