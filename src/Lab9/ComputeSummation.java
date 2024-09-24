package src.Lab9;

public class ComputeSummation {
    public static double m(int i) {
        double ans = 0;
        for (double j = 1.0;j<i+1;j++) {
            ans += j/(j+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("i\t\tm(i)");
        for (int i=1;i<21;i++) {
            System.out.printf("%d\t\t%.4f\n", i, m(i));
        }
    }
}
