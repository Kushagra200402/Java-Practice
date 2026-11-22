import java.util.Arrays;
import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("No. of Elements in the Array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Give Inputs in the Array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Your Array");
        System.out.println(Arrays.toString(arr));
        if(FindMin(arr)==-1)
            System.out.println("No Elements");
        else
            System.out.println("Minimum value in the Array: "+FindMin(arr));
    }

    private static int FindMin(int[] A) {
        if(A.length==0)
            return -1;
        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            if (min > A[i])
                min = A[i];
        }
        return min;
    }
}
