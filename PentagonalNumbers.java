// Hyunwoo(Henry) Ahn 116598178
import java.util.Scanner;
public class PentagonalNumbers {
    public static void main(String[] args) {
        int n = -1;
        Scanner input = new Scanner(System.in);
        while (n < 0) {
            System.out.print("Enter n: ");
            n = input.nextInt();
        }
        input.close();
        System.out.println("Pentagonal number: " + n*(3*n-1)/2);
    }
}
