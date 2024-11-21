package Lab24;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }

    public static int reverse(int value) {
        int reversed = 0;
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        return reversed;
    }
}
