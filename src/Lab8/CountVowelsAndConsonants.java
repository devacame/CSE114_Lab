package src.Lab8;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        int cntConsonant = 0, cntVowel = 0;
        Scanner input = new Scanner(System.in);
        String ip = "";
        while (ip.isEmpty()) {
            System.out.print("Enter a string: ");
            ip = input.nextLine();
            ip = ip.toLowerCase();
        }
        input.close();
        for (int i=0;i<ip.length();i++) {
            char c = ip.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cntVowel++;
            } else if (c == ' ') continue;
            else {
                cntConsonant++;
            }
        }
        System.out.println("The number of vowels is " + cntVowel);
        System.out.println("The number of consonants is " + cntConsonant);
    } 
}
