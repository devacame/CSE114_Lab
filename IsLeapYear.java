// Hyunwoo(Henry) Ahn 116598178
import java.util.Scanner;
public class IsLeapYear {
    public static void main(String[] args) {
        boolean isLeap = false;
        int year = -1;
        Scanner input = new Scanner(System.in);
        while (year < 0) {
            System.out.print("Enter in a year: ");
            year = input.nextInt();
        }
        input.close();
        if (year % 400 == 0 || (year % 400 != 0 && year % 100 != 0 && year % 4 == 0)) isLeap = true;
        System.out.println(year + (isLeap ? " is " : " is not ") + "a leap year");
    }
}
