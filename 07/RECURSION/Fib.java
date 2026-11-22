public class Fib {
    public static void main(String[] Args){
       int[] arr = {4, 12, 35, 78, 124, 213};
       int target = 4;
       System.out.println(bsusingrecursion(arr, target, 0, arr.length-1));
    }

    static int bsusingrecursion(int[] num, int target, int start, int end){

        int mid = start + (end - start)/2;
        if (start > end){
            return -1;
        }
        if (target == num[mid]){
            return mid;
        }
        if (num[mid] < target){
            return bsusingrecursion(num, target, mid+1, end);
        }
            return bsusingrecursion(num, target, start, mid-1);
    }
}
