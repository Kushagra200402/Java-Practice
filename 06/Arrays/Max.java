public class Max {
    public static void main(String[] args) {
        int[] arr = {45, 63, 2, 29, 0};
        System.out.println("Maximum value in the Array");
        System.out.println(max(arr));
        System.out.println("Maximum value between the range");
        System.out.println(maxRange(arr, 2, 4));
    }


//    We can also work on edge cases like when Array is null etc.
    static int maxRange(int[] A, int start, int end) {
        if(A == null) {
            return -1;
        }
        int maxVal = A[start];
        for (int i = start; i <= end; i++) {
            if(A[i] > maxVal){
                maxVal = A[i];
            }
        }
        return maxVal;
    }

//        imagine that array is not empty
    static int max(int[] A) {
        if (A.length==0){
            return -1;
        }
        int maxVal = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > maxVal) {
                maxVal = A[i];
            }
        }
        return maxVal;
    }

    static void reverse(int[] arr){
        int temp = 0;
        int l = 0;
        int h = arr.length-1;

        while(l<h){
            temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }
    }
}