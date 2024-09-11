// Hyunwoo(Henry) Ahn 116598178
import java.util.Scanner;
public class Triangle {
   public static void main(String[] args) {
        double s1 = -1.0, s2 = -1.0, s3 = -1.0, max = -1.0;
        Scanner input = new Scanner(System.in);
        while (s1 < 0.0) {
            System.out.print("Side1: ");
            s1 = input.nextDouble();
            max = s1;
        }
        while (s2 < 0.0) {
            System.out.print("Side2: ");
            s2 = input.nextDouble();
            if (s2 > max) max = s2;
        }
        while (s3 < 0.0) {
            System.out.print("Side3: ");
            s3 = input.nextDouble();
            if (s3 > max) max = s3;
        }
        input.close();
        if (max >= (s1+s2+s3-max)) {
            System.out.println("Invalid input!");
            return ;
        }
        if (s1 == s2 && s2 == s3){
            System.out.println("Equilateral");
            return ;
        }
        if (s1 == s2 || s2 == s3 || s3 == s1) {
            System.out.println("Isoceles");
            return ;
        }
        System.out.println("Scalene");
   } 
}
