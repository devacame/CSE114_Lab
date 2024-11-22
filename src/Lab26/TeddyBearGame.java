package Lab26;

public class TeddyBearGame {
    public static boolean canWin(int initial, int goal, int increment, int n) {
        if (n < 0)
            return false;
        if (initial == goal)
            return true;
        return canWin(initial + increment, goal, increment, n - 1)
                || (initial % 2 == 0 ? canWin(initial / 2, goal, increment, n - 1) : false);
    }

    public static void main(String[] args) {
        System.out.println(canWin(99, 91, 53, 5));
    }
}
