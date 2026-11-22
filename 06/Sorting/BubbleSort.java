import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {34, 12, 24, 78, 10};
        int[] arr = {1, 2, 3, 5, 6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
//        run the steps n-1 times
        for(int i=0; i<arr.length; i++){
            swapped = false;
//            for each index, max item will come at the last respective index
            for(int j=1; j<arr.length-i; j++){
//                swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
//                    swap
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   swapped = true;
                }
            }
//            if you didn't swap for the particular value of i that means the array is sorted hence stop the function
            if(!swapped){ // Or 'swapped == false' as !false = true
                break;
            }
        }
    }
}

//Time complexity: Best Case = O(n), Worst Case = O(n^2)
