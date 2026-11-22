import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, -4, 3, -2, 0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
//            find max item in the remaining array and swap correct index
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int maxInd, int last){
        int temp = arr[maxInd];
        arr[maxInd] = arr[last];
        arr[last] = temp;
    }
}

//Time complexity: Best Case = O(n^2), Worst Case = O(n^2)
