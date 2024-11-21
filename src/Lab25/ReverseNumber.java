package Lab25;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(reverse(input.nextInt()));
        input.close();
    }

    public static int reverse(int value) {
        if (value < 10) {
            return value;
        } else {
            return value % 10 * (int) Math.pow(10, (int) Math.log10(value)) + reverse(value / 10);
        }
    }
}
