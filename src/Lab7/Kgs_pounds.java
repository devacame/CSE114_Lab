package src.Lab7;

public class Kgs_pounds {
    public static void main(String[] args) {
        System.out.println("Kilograms Pounds Pound Kilograms");
        for (int i=1,j=20;i<200;i+=2,j+=5) {
            System.out.printf("%9d %6.1f %5d %8.2f\n", i, i*2.2, j, j/2.2);
        }
    }
}
