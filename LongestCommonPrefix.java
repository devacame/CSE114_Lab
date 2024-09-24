// 116598178 Hyunwoo(Henry) Ahn

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String i1 = "", i2 = "";
        Scanner input = new Scanner(System.in);
        while (i1.isEmpty()) {
            System.out.print("Enter the first string: ");
            i1 = input.nextLine();
        }
        while (i2.isEmpty()) {
            System.out.print("Enter the second string: ");
            i2 = input.nextLine();
        }
        input.close();
        int l = i1.length() > i2.length() ? i2.length() : i1.length();
        String ans = "";
        for (int i=0;i<l;i++) {
            if (i1.charAt(i) != i2.charAt(i)) {
                if (i == 0) break;
                ans = i1.substring(0, i);
                break;
            }
        }
        if (ans.length() == 0) {
            System.out.printf("%s and %s have no common prefix\n", i1, i2);
        } else {
            System.out.printf("The common prefix is %s\n", ans);
        }
    }
}
