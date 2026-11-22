//https://leetcode.com/problems/set-mismatch/submissions/1101412080/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findMissingAndWrong(arr)));
    }

    static int[] findMissingAndWrong(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correctInd = arr[i]-1;
            if(arr[i] != arr[correctInd]){
                swap(arr, i, correctInd);
            }else{
                i++;
            }
        }

        for(i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                return new int[]{arr[i], i+1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int i, int correctInd){
        int temp = arr[i];
        arr[i] = arr[correctInd];
        arr[correctInd] = temp;
    }

}
