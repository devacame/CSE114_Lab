// 116598178 Henry Ahn

public class ArrayUtils {
    public static int[] randomArray(int size, int limit) {
        int[] res = new int[size];
        for (int i=0;i<size;i++) {
            res[i] = (int)(Math.random()*limit);
        }
        return res;
    }
    public static void print(int[] array) {
        System.out.print("[");
        for (int e: array) {
            System.out.print(e + " ");
        }
        System.out.println("]");
    }
    public static int arraySum(int[] array) {
        int sum = 0;
        for (int e: array) {
            sum += e;
        }
        return sum;
    }
    public static int contains(int[] array, int key) {
        for (int i=0;i<array.length;i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }
    public static int countMultiplesOf(int[] array, int key) {
        int cnt = 0;
        for (int e: array) {
            if (e % key == 0) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] array = randomArray(100, 21);
        // print(array);
        System.out.println("The average of array is " + (double)arraySum(array)/array.length);
        int indexOf12 = contains(array, 12);
        System.out.println("The array " + (indexOf12 >= 0 ? "has 12 at index " + indexOf12 : "doesn't have 12") + ".");
        System.out.println("The array has " + countMultiplesOf(array, 7) + " multiples of 7.");
    }
}
