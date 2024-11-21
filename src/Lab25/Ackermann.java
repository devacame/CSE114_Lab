package Lab25;

public class Ackermann {
    public static int A(int a, int b) {
        if (a == 0 && b >= 0)
            return b + 1;
        if (a > 0 && b == 0)
            return A(a - 1, 1);
        if (a > 0 && b > 0)
            return A(a - 1, A(a, b - 1));
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(A(3, 4));
    }
}
