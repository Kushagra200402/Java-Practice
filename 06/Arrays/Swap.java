import java.util.Arrays;

import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 42, 6, 553, 0, 89, 9};
        System.out.println("Array before swap function");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after swap function");
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after reverse function");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] A, int index1, int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    static void reverse(int[] A){
        int start = 0;
        int end = A.length-1;
        while(start<end) {
            swap(A, start, end);
            start++;
            end--;
        }
    }
}
