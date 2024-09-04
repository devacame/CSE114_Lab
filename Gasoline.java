import java.util.Scanner;

public class Gasoline {
    public static void main(String[] args) {
        int minutes = 0;
        double mph = 0.0, mpg = 0.0;
        Scanner input = new Scanner(System.in);

        while (minutes < 0) {
            System.out.print("Enter the number of minutes: ");
            minutes = input.nextInt();
        }
        while (mph < 0) {
            System.out.print("Enter the constant speed of the car(m/h): ");
            mph = input.nextDouble();
        }
        while (mpg < 0) {
            System.out.print("Enter the fuel efficiency of the car (m/g): ");
            mpg = input.nextDouble();
        }
        input.close();

        System.out.println("Consumed gas for the period (in gallons): " + minutes / 60.0 * mph / mpg);
    }
}
