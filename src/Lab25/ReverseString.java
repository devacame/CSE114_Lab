package Lab25;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        reverseDisplay(s);
        input.close();
    }

    public static void reverseDisplay(String str) {
        reverseDisplay(str, str.length() - 1);
    }

    public static void reverseDisplay(String str, int high) {
        if (high >= 0) {
            System.out.print(str.charAt(high));
            reverseDisplay(str, high - 1);
        }
    }
}
