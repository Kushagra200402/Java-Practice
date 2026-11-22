//https://leetcode.com/problems/find-the-duplicate-number/
//Asked in Amazon, Microsoft
public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate Element in the array: "+duplicate(arr));
    }

    static int duplicate(int[] nums){
        int i = 0;
        while (i<nums.length){
            int correctInd = nums[i]-1;
//            Checking whether the numbers are at correct Index or not
            if(nums[i] == i+1){
                i++;
            }else{
                if(nums[i] != nums[correctInd]){
//            swapping the values if they are not in correct Index
                    swap(nums, i, correctInd);
                }else{
                    return nums[i];
                }
            }
        }

        return -1;
    }

    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
