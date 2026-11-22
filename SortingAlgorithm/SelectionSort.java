
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values in array");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Array before sorting");
        BubbleSort.DisplayArray(arr, n);

        for(int i=0; i<n-1; i++){
            int index = i;
            for(int j=i+1; j<n; j++){
                if(arr[index]>arr[j]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        System.out.println("Array after sorting");
        BubbleSort.DisplayArray(arr, n);
    }
}
