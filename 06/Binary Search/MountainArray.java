//https://leetcode.com/problems/peak-index-in-a-mountain-array/     //Easy in leetcode
//https://leetcode.com/problems/find-peak-element/    //Medium in leetcode

public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 1};    //Bitonic array
        System.out.println("Peak Index = "+peakIndex(arr));
        int target = 3;
        if(Search(arr, target)==-1){
            System.out.println("Target element not found");
        }else{
            System.out.println("Target element found at Index no. "+Search(arr, target));
        }
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start< end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
//                you are in decreasing part of the array
//                this may be the ans, but look at left to it
//                mid can also be the ans that's why end != mid-1
                end = mid;
            } else{
//                you are in ascending part of the array
                start = mid+1;  // because we know that mid+1 element > mid element
            }
        }
//        in the end, start == end and pointing to the largest number because of the two checks above
//        start and end are always trying to find maximum element in above two checks
//        hence when they are pointing to just one element (same element), that is the max one because that is what the checks say
//        more elaboration: At every point of time for start and end, they have the best possible answer till that time,
//        and if we are saying that only item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are equal
    }

//    https://leetcode.com/problems/find-in-mountain-array/    //leetcode Hard
    static int Search(int[] arr, int target){
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
//        Try to search in second half i.e. in desc array
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else {
                if(arr[mid]<target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
