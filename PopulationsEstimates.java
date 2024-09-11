// Hyunwoo(Henry) Ahn 116598178
import java.util.Scanner;
public class PopulationsEstimates {
    public static void main(String[] args) {
        int year = -1;
        Scanner input = new Scanner(System.in);
        while (year < 0) {
            System.out.print("Enter a year: ");
            year = input.nextInt();
        } 
        input.close();
        System.out.println("Population estimate (millions of people): " + (((year%100)-10)*3+310));
    }
}
