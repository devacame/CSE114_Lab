package Lab24;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(234));
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
