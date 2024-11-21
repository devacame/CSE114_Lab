package Lab25;

public class SequenceSum {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(m(i));
        }
    }

    public static double m(int n) {
        if (n < 2)
            return 1;
        return 1.0 / n + m(n - 1);
    }
}
