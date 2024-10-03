// 116598178 Henry Ahn

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String ip = input.nextLine();
        input.close();
        String ipClean = ip.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i=0;i<ipClean.length()/2;i++) {
            if (ipClean.charAt(i) != ipClean.charAt(ipClean.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input string " + ip + " is " + (isPalindrome ? "" : "NOT ") + "a palindrome.");
    }
}
