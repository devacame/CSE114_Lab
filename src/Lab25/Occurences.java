package Lab25;

public class Occurences {
    public static void main(String[] args) {
        System.out.println(count("Welcome", 'e'));
    }

    public static int count(String str, char ch) {
        return count(str, ch, 0);
    }

    public static int count(String str, char ch, int pos) {
        if (pos == str.length())
            return 0;
        return (str.charAt(pos) == ch ? 1 : 0) + count(str, ch, pos + 1);
    }
}
