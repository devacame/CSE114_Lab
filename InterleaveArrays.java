// 116598178 Henry Ahn

public class InterleaveArrays {
    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int[] res = new int[array1.length+array2.length];
        int index = 0;
        for (int i=0;i<Math.max(array1.length, array2.length);i++) {
            if (i < array1.length) res[index++] = array1[i];
            if (i < array2.length) res[index++] = array2[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] test1 = {10, 20, 30, 40, 50, 60, 70, 80}, test2 = {2, 4, 6, 8}; 
        for (int e: interleaveArrays(test1, test2)) {
            System.out.print(e + " ");
        }
        System.out.println();
    }    
}
