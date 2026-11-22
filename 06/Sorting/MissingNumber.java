//https://leetcode.com/problems/missing-number/
//Amazon Question (Cyclic Sort Example)
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctInd = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctInd]) {
                int temp = nums[i];
                nums[i] = nums[correctInd];
                nums[correctInd] = temp;
            } else {
                i++;
            }
        }
//        search for first missing number
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
//        case 2
        return nums.length;
    }
}