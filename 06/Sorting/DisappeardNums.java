//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
//Google Question
import java.util.ArrayList;
import java.util.List;

class DisappeardNums {
    public static void main(String[] args) {
       int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
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
        ArrayList<Integer> list = new ArrayList<>(10);
        i = 0;
        while (i < nums.length){
            if(nums[i] != i+1){
                list.add(i+1);
            }
            i++;
        }
        return list;
    }
}