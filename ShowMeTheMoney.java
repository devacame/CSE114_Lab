// Hyunwoo(Henry) Ahn 116598178
import java.util.Scanner;
public class ShowMeTheMoney {
    public static void main(String[] args) {
        int farthings = -1, penny, shilling, pound;
        Scanner input = new Scanner(System.in);
        while (farthings < 0) {
            System.out.print("Enter in the number of farthings: ");
            farthings = input.nextInt();
        }
        input.close();
        pound = farthings / 960;
        farthings %= 960;
        shilling = farthings / 48;
        farthings %= 48;
        penny = farthings / 4;
        farthings %= 4;
        System.out.println(String.format("Pound Sterling %d\nShilling %d\nPenny %d\nFarthings %d", pound, shilling, penny, farthings));
    }
}
