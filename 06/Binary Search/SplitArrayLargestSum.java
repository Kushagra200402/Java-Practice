public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int max_sum = splitArray(arr, 2);
        System.out.println("minimized largest sum of the sub-Array is "+max_sum);
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++){
            start = Math.max(start, nums[i]); //In the end of the loop this will contain the maximum item from the array
            end += nums[i]; //end = sum of elements of biggest sub array that is the array itself
        }

        //Apply binary search
        while(start<end){
//            try for the middle as potential answer
            int mid = start + (end - start)/2;

//            Calculate how many pieces you can divide this in with this max sum
            int sum = 0;  //sum of the elements of sub array
            int pieces = 1;  //In how many no. of sub arrays we are dividing the main array
            for(int num: nums){
                if(sum + num > mid){
//                    Now you can not add this element in the sub-array, you've to make new one
//                    Say you add this num in new sub-array, then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return end; //here start = end;
    }
}
