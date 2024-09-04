import java.util.Scanner;

public class Celcius2Fahreneheit {
    public static void main(String[] args) {
        double celcius, fahrenheit;
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        celcius = temp.nextDouble();
        temp.close();
        fahrenheit = celcius * 1.8 + 32;
        System.out.println(((int) celcius == celcius ? Integer.toString((int) celcius) : Double.toString(celcius))
                + " in Celcius is " + fahrenheit
                + " in Fahrenheit");
    }
}
