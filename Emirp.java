public class Emirp {
    private static int reverseNum(int n) {
        int c = n, chk = 0;
        while (c > 0) {
            chk = chk * 10 + c%10;
            c /= 10;
        }
        return chk;
    }
    private static boolean non_palindrome(int n) {
        return reverseNum(n) != n;
    }
    private static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i=2;i*i<=n;i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int cnt = 0, num = 2;
        while (cnt < 100) {
            if (non_palindrome(num) && prime(num) && prime(reverseNum(num))) {
                System.out.print(num + " ");
                cnt++;
            }
            num++;
        } 
    }
}
