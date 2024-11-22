package Lab26;

public class Triangle {
    public static void main(String[] args) {
        triangle(8);
    }

    public static void triangle(int n) {
        triangle(n, 1);
    }

    public static void triangle(int n, int cur) {
        if (n == cur)
            return;
        for (int i = 0; i < cur; i++)
            System.out.print("*");
        System.out.println();
        triangle(n, cur + 1);
    }
}
