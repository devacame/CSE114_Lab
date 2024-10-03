// 116598178 Henry Ahn

import java.util.Scanner;

public class DecimalToBinary {
    private static String dec2Bin(int value) {
        String ans = "";
        while (value > 0) {
            ans = (char)('0'+(value%2)) + ans;
            value /= 2;
        }
        return "("+ ans + ")_2";
    }
    public static void main(String[] args) {
        System.out.print("Enter decimal: ");
        Scanner ip = new Scanner(System.in);
        int val = ip.nextInt();
        ip.close();
        System.out.println("Binary: " + dec2Bin(val));
    }
}
