package Lab24;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(factorial(i));
        }
    }

    public static long factorial(int n) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}
