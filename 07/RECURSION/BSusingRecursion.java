public class BSusingRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 12, 23, 45, 78, 96, 119};
        int target = 96;
        System.out.println(search(arr, target));
    }

    // static int search(int[] arr, int target, int start, int end){
    //     if(start > end) {
    //         return -1;
    //     }

    //     int mid = start + (end - start)/2;

    //     if (target == arr[mid]) {
    //         return mid;  // Make sure you're returning the integer as int is return type
    //     }

    //     if(target > arr[mid]) {
    //         return search(arr, target, mid + 1, end); //Make sure you're returning sub recursion calls over here
    //     }

    //     return search(arr, target, start, mid - 1);
    // }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (start > end){
            return -1;
        }
        return rec_search(nums, target, start, end);
    }

    public static int rec_search(int[] arr, int t, int s, int e){
        int mid = s + (e - s)/2;
        if (arr[mid] == t){
            return mid;
        }
        if (t >= arr[mid]){
            return rec_search(arr, t, mid+1, e);
        }else{
            return rec_search(arr, t, s, mid-1);
        }
    }
}
