//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
import java.util.ArrayList;
import java.util.List;

public class MultipleDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr).toString());
    }

    static List<Integer> findDuplicates(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>(5);
        for(i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
