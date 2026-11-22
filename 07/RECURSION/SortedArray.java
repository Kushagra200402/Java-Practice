public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 8};
        int index = 0;
        System.out.println(isSorted(arr, index));
    }

    private static boolean isSorted(int[] arr, int index) {
        if (index == arr.length-1){
            return true;
        }
        return (arr[index] < arr[index+1]) && isSorted(arr, index+1);
    }
}
