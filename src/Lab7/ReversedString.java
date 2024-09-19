package src.Lab7;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        String in = "";
        Scanner input = new Scanner(System.in);
        while (in == "") {
            System.out.print("Input string: ");
            in = input.next();
        } 
        input.close();
        for (int i = in.length()-1;i>=0;i--) {
            System.out.print(in.charAt(i));
        }
    }
}
