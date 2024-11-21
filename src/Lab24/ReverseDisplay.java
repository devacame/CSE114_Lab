package Lab24;

import java.util.Scanner;

public class ReverseDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        reverseDisplay(input.nextInt());
        input.close();
    }

    public static void reverseDisplay(int value) {
        int reversed = 0;
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        System.out.println(reversed);
    }
}
