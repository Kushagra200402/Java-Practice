//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class SearchInfiniteArray {
    public static void main(String[] args){
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 170};
        int target = 130;
        if(ans(arr, target)==-1){
            System.out.println("The value "+target+" does not exist in this array");
        }else {
            System.out.println("The value " + target + " lies at index no. " + ans(arr, target));
        }
    }

    static int ans(int[] arr, int target) {
//        first find the range
//        first start with box of size 2
        int start = 0;
        int end = 1;
//        condition for the target to lie in range
        while(target>arr[end]){
//            double the size of the array
            int newStart = end+1;
//            double the box value
//            end = previous end + sizeof(box) * 2;
            end = end + (end - start + 1) * 2;   // size = end - (start - 1)
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = 0;
        while(start<=end){
            mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target<arr[mid]) {
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
