import java.util.Scanner;

public class BS {
    public static void main(String[] args) {
//        int[] arr = {-12, 2, 4, 7, 11, 43, 58, 91, 113, 216};
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter ");
//        int value = search(arr, 43);

//        Search in descending order sorted matrix
        int[] arr = {45, 32, 18, 7, 0, -12, -23};
        int value = search(arr, -12);
        System.out.println("The target element is at index "+ value);
    }
    public static int search(int[] num, int target){
        int start = 0;
        int end = num.length - 1;
//        int mid = start + (end - start)/2;
        boolean isAsc = num[start] < num[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target == num[mid]) {
                return mid;
            }
            if(isAsc) {
                if (target < num[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if(target < num[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
//    arr[] = {45, 32, 18, 7, 0, -12, -23}
//    public static int searchInDesc(int[] num, int target){
//        int start = 0;
//        int end = num.length - 1;
//
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if(target < num[mid]){
//                start = mid+1;
//            }else if(target > num[mid]){
//                end = mid-1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }

    

}
