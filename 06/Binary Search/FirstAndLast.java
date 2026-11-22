//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = {1, 2, 13, 13};
        int target = 13;
        int[] ans = searchIndex(nums, target);
        System.out.println(Arrays.toString(ans)); //Print an Array using standard library Arrays
    }

    static int[] searchIndex(int[] nums, int target){
        int[] ans = {-1, -1};

//        checking the first occurence of target first
        ans[0] = search(nums, target, true);
        if(ans[0]!=-1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

//    this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else {
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
