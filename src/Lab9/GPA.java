package src.Lab9;

public class GPA {
    public static double gpaCalculator(String[] grades) {
        double ans = 0.0;
        for (String s : grades) {
            switch (s) {
                case "A":
                    ans += 4.0;
                    break;
                case "A-":
                    ans += 3.67;
                    break;
                case "B+":
                    ans += 3.33;
                    break;
                case "B":
                    ans += 3.0;
                    break;
                case "B-":
                    ans += 2.67;
                    break;
                case "C+":
                    ans += 2.33;
                    break;
                case "C":
                    ans += 2.0;
                    break;
                case "C-":
                    ans += 1.67;
                    break;
                case "D+":
                    ans += 1.33;
                    break;
                case "D":
                    ans += 1.0;
                    break;
                case "F":
                    break;
                default:
                    return -1.0;
            }
        }
        ans /= grades.length;
        return ans;
    }
    public static void main(String[] args) {
        System.out.printf("GPA of F, C+, D+, A+ is %f\n", gpaCalculator(new String[]{"F", "C+", "D+", "A+"}));
        System.out.printf("GPA of A, F, C, B is %f\n", gpaCalculator(new String[]{"A", "F", "C", "B"}));
    }
}
