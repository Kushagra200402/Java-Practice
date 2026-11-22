import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
    }
}

//If the range of numbers are given from 1 to N , we have to use "cyclic sort".
//My first naive approach
//for(int i=0; i<nums.length; i++){
//        while(nums[i]-1 != i){
//        int temp = nums[nums[i]-1];
//        nums[nums[i]-1] = nums[i];
//        nums[i] = temp;
//        }
//        }