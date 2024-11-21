package Lab25;

import java.util.Scanner;

public class ReverseDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        reverseDisplay(input.nextInt());
        input.close();
    }

    public static void reverseDisplay(int value) {
        if (value < 10) {
            System.out.println(value);
        } else {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }
}
