package Lab24;

public class ReverseDisplay {
    public static void main(String[] args) {
        reverseDisplay(12345);
    }

    public static void reverseDisplay(int value) {
        int reversed = 0;
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        System.out.println(reversed);
    }
}
