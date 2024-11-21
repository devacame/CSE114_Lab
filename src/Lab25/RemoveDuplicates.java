package Lab25;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aafadfdsafsdfsdfsdfasdfasdf";
        System.out.println(removeDuplicates(str));
    }

    public static String remove(char c, String str) {
        if (str.length() == 0)
            return "";
        if (str.charAt(0) == c)
            return remove(c, str.substring(1));
        return str.charAt(0) + remove(c, str.substring(1));
    }

    public static String removeDuplicates(String str) {
        if (str.length() == 0)
            return "";
        return str.charAt(0) + removeDuplicates(remove(str.charAt(0), str.substring(1)));
    }
}
