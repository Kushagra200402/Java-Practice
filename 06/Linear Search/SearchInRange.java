public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {34, 21, 6, 7, 0, 10, 149, 31, 84, 60};
        int check_val = 10;
//        System.out.println(Search(arr, check_val, 1, 6));
        int index = Search(arr, check_val, 1, 6);
        System.out.println("Element found at index number: "+index);
    }

    static int Search(int[] arr, int target, int start, int end) {
        for(int i = start; i<=end; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
