//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCount {
    public static void main(String[] args) {
//        int[] arr = {15, 18, 2, 3, 6, 12};
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int max = IndexOfMax(arr);   //function same as pivot(arr)
        int rotationCount = max+1;
        System.out.println("Rotation count of the array is "+rotationCount);
    }

    static int IndexOfMax(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
