package Lab26;

public class NumberPyramid {
    public static void pyramid(int n) {
        pyramid(n, 1);
    }

    public static void pyramid(int n, int cur) {
        if (cur > n)
            return;
        for (int i = 0; i < n - cur; i++) {
            System.out.print("  ");
        }
        for (int i = cur; i > 0; i--) {
            System.out.print(i + " ");
        }
        for (int i = 2; i <= cur; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        pyramid(n, cur + 1);
    }

    public static void main(String[] args) {
        pyramid(5);
    }
}
