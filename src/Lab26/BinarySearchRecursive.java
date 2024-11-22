package Lab26;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int index = binarySearch(arr, 0, arr.length - 1, 3);
        System.out.println(index + " " + arr[index]);
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] > key)
            return binarySearch(arr, low, mid - 1, key);
        return binarySearch(arr, mid + 1, high, key);
    }
}
