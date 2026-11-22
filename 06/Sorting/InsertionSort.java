import java.util.Arrays;

//With every pass, left side of the array is getting sorted
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 1, 2};
        Insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void Insertion(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;;
                }else {
                    break;
                }
            }
        }
    }
}

//Time complexity: Best Case = O(n), Worst Case = O(n^2)