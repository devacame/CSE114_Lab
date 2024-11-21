package Lab24;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(reverse(input.nextInt()));
        input.close();
    }

    public static int reverse(int value) {
        int reversed = 0;
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        return reversed;
    }
}
