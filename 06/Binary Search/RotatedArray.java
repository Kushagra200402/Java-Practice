//https://leetcode.com/problems/search-in-rotated-sorted-array/
//Important Question
public class RotatedArray {
    public static void main(String[] args) {
//        int[] arr = {2, 2, 2, 9, 2};  //pivot function will not work in this case because start = mid = end;
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
//        int pivotIndex = findPivot(arr);
        int pivotIndex = pivot(arr);
        System.out.println("Pivot element is at Index "+pivotIndex);
        int target = 2;
        System.out.println("target element is found at Index "+Search(arr, target));
    }

    static int Search(int[] arr, int target){
        int pivotIndex = pivot(arr);
//        int pivotIndex = findPivot(arr);
//        If you did not find the pivot that means array is not rotated
        if(pivotIndex == -1){
//            Just do normal binary search
            return BinarySearch(arr, target, 0, arr.length-1);
        }
//        If pivot is found then you have two ascending sorted arrays
        if(arr[pivotIndex]==target){
            return pivotIndex;
        }
        if(target>=arr[0]) {     //If the target element > start element
            return BinarySearch(arr, target, 0, pivotIndex-1);
        }else{                 //If the target element < start element
            return BinarySearch(arr, target, pivotIndex+1, arr.length-1);
        }
    }

//    Searching for pivot element
//    This will not work for duplicate values
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
//            4 Cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

//    Function to find pivot element in duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
//            4 Cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
//            If elements at start, middle and end are equal then just skip the duplicates
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
//                skip the duplicates
//                NOTE : What if the elements at start and end were the pivots??
//                check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
//                check if end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
//            Left side is sorted so the pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    //Binary Search for target element
    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
