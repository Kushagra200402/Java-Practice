public class FindMinInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }

//    static int findMin(int[] nums) {
//        int start = 0;
//        int end = nums.length-1;
//        while(start<=end){
//            int mid = start + (end - start)/2;
//            if(mid>start && nums[mid]<nums[mid-1]){
//                return nums[mid];
//            }
//            if(mid<end && nums[mid]>nums[mid+1]){
//                return nums[mid+1];
//            }
//            if(nums[mid]>=nums[start]){
//                start = mid+1;
//            }else{
//                end = mid-1;
//            }
//        }
//        return nums[start];
//    }

    static int findMin(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
//            4 Cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }else if(start<mid && arr[mid]<arr[mid-1]){
                return arr[mid];
            }else if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return arr[end];
    }
}
