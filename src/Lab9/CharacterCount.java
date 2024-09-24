package src.Lab9;

import java.util.Scanner;

public class CharacterCount {
    public static int count(String str, char a) {
        int cnt = 0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) == a) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        String m = "";
        char c = ' ';
        Scanner input = new Scanner(System.in);
        while (m.isEmpty()) {
            System.out.print("Enter a string: ");
            m = input.nextLine();
            System.out.print("Enter a character: ");
            c = input.next().charAt(0);
        }
        input.close();
        System.out.printf("There are %d %c in %s\n", count(m, c), c, m);
    }
}
