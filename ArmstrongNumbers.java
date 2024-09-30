// 116598178 Hyunwoo(Henry) Ahn

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int lower = -1, upper = -1;
        Scanner input = new Scanner(System.in);
        while (lower < 0) {
            System.out.print("Enter the lower limit: ");
            lower = input.nextInt();
        }
        while (upper < 0) {
            System.out.print("Enter the upper limit: ");
            upper = input.nextInt();
        }
        input.close();
        System.out.print("The Armstrong numbers between " + lower + " and " + upper + " are: ");
        for (int i=lower;i<=upper;i++) {
            int tmp = 0, init = i, cnt = 0;
            while (init > 0) {
                cnt++;
                init /= 10;
            }
            init = i;
            while (init > 0) {
                int ones = init % 10;
                tmp += (int)Math.pow(ones, cnt);
                init /= 10;
            }
            if (tmp == i) System.out.print(i + " ");
        }
        System.out.println();
    } 
}
