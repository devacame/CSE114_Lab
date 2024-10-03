// 116598178 Henry Ahn

import java.util.Scanner;

public class Anagram {
    private static char[] sort(char[] arr) {
        for (int i=1;i<arr.length;i++) {
            char key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    
    private static boolean anagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();
        if (s1.length() != s2.length()) return false;
        char[] arr1 = sort(s1.toCharArray()), arr2 = sort(s2.toCharArray());
        for (int i=0;i<arr1.length;i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = input.nextLine();
        System.out.print("Enter the second string: ");
        String second = input.nextLine();
        input.close();
        System.out.println(first + " and " + second + " are " + (anagram(first, second) ? "" : "NOT ") + "anagrams.");
    }
}
