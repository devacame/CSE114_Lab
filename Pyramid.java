// 116598178 Hyunwoo(Henry) Ahn

import java.util.Scanner;

public class Pyramid {
    public static String repeatString(String s, int repeat) {
        return new String(new char[repeat]).replace("\0", s);
    }
    public static int nOfDigits(int num) {
        int cnt = 0;
        while (num > 0) {
            cnt++;
            num /= 10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = -1;
        Scanner input = new Scanner(System.in);
        while (n < 0) {
            System.out.print("Enter the number of lines: ");
            n = input.nextInt();
        }
        input.close();
        System.out.println("Output:");
        int maxCnt = nOfDigits((int)Math.pow(2, n-1))+1;
        for (int i=1;i<=n;i++) {
            for (int j=0;j<n-i;j++) {
                System.out.print(repeatString(" ", maxCnt));
            }
            for (int j=0;j<2*i-1;j++) {
                int power;
                if (j < i) {
                    power = (int)Math.pow(2, j);
                } else {
                    power = (int)Math.pow(2, 2*i-2-j);
                }
                int cnt = nOfDigits(power);
                System.out.print(repeatString(" ", maxCnt-cnt));
                System.out.printf("%d", power);
            }
            System.out.println();
        }
    }
}
