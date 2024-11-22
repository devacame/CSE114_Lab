package Lab26;

public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        selectionSort(arr, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr, int start) {
        if (start == arr.length - 1)
            return;
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex])
                minIndex = i;
        }
        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;
        selectionSort(arr, start + 1);
    }
}
