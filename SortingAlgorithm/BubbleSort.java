import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the inputs");
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Array before Sorting");
        DisplayArray(arr, n);

        for (int i=1; i < n; i++){  //i = No. of iterations
            for(int j=0; j<n-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\n");
        System.out.println("Array after Sorting");
        DisplayArray(arr, n);
    }


    static void DisplayArray(int arr[], int n){
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
