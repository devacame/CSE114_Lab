// 116598178 Henry Ahn

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String ipClean = str.replaceAll("\\s+", "").toLowerCase();
        for (int i=0;i<ipClean.length()/2;i++) {
            if (ipClean.charAt(i) != ipClean.charAt(ipClean.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String ip = input.nextLine();
        input.close();
        System.out.println("Input string " + ip + " is " + (isPalindrome(ip) ? "" : "NOT ") + "a palindrome.");
    }
}
