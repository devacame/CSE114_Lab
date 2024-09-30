// 116598178 Hyunwoo(Henry) Ahn

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int limit = -1;
        Scanner input = new Scanner(System.in);
        while (limit < 0) {
            System.out.print("Enter the upper limit: ");
            limit = input.nextInt();
        }
        input.close();
        System.out.print("The perfect numbers below " + limit + " are: ");
        for (int i=2;i<limit;i++) {
            int j = 0, tmp = 0;
            for (j=1;j*j<i;j++) {
                if (i%j == 0) {
                    tmp += j + i/j;
                }
            }
            if (j*j == i) tmp += j;
            if (i*2 == tmp) System.out.print(i + " ");
        }
        System.out.println();
    }
}
