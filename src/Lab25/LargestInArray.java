package Lab25;

public class LargestInArray {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int findLargest(int[] list, int currentIndex) {
        if (currentIndex == list.length - 1)
            return list[currentIndex];
        return max(list[currentIndex], findLargest(list, currentIndex + 1));
    }

    public static void main(String[] args) {
        int[] list = { 2, 1 };
        System.out.println(findLargest(list, 0));
    }
}
