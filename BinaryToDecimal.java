// 116598178 Henry Ahn

import java.util.Scanner;

public class BinaryToDecimal {
    private static int bin2Dec(String binaryString) {
        int ans = 0, cur = 1;
        for (int i=binaryString.length()-1;i>=0;i--) {
            ans += cur * (binaryString.charAt(i)-'0');
            cur *= 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter binary: ");
        Scanner ip = new Scanner(System.in);
        String bString = ip.next();
        ip.close();
        System.out.println("Decimal: " + bin2Dec(bString));
    } 
}
