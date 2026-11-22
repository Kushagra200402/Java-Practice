//https://leetcode.com/problems/first-missing-positive/
//Amazon Interview Question

class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] arr = {7, 8, 9, 10, 11};
        int[] arr = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
//Ignore the negative and values which are greater than length of the array
            if((nums[i] > 0 && nums[i] <= nums.length) && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
// Case 1: first element which is not in correct Index is the answer
        for(i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
 //Case 2: If all the elements are in correct Index then 1st missing positive is,
        return nums.length+1;
    }
}