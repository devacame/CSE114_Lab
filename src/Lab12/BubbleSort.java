package src.Lab12;

public class BubbleSort {
    private static double[] bubbleSort(double[] orig) {
        double[] arr = orig.clone();
        boolean changed = true;
        do {
            changed = false;
            for (int i=0;i<arr.length-1;i++) {
                if (arr[i] > arr[i+1]) {
                    double temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    changed = true;
                }
            }
        } while (changed);
        return arr;
    }
    public static void main(String[] args) {
        double[] testArr = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        double[] sortedArr = bubbleSort(testArr);
        for (double ele: sortedArr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
