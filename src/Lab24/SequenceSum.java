package Lab24;

public class SequenceSum {
    public static double m(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(m(i));
        }
    }
}
