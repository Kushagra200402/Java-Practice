public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-13, -9, -3, 0, 7, 19, 25, 37, 67, 89, 109};
                int[] arr = {109, 89, 34, 15, 11, 7, 4, 1, 0, -8, -25, -78};
                int ans = SearchIndex(arr, 4);
                System.out.println(ans);
            }

            //    return index
//    return -1 if target element does not exist in the array
            static int SearchIndex(int[] arr, int target) {
                int start = 0;
                int end = arr.length - 1;

//                Find whether the array is sorted in Ascending or Descending
                boolean isAsc = arr[start]<arr[end]; //true-> asc , false -> desc

                while(start<=end){
                    int mid = start + (end - start)/2;
                    if(arr[mid]==target){
                        return mid;
                    }
                    if(isAsc){
                        if(target>arr[mid]){
                            start = mid+1;
                        } else{
                            end = mid-1;
                        }
                    }else{
                        if(target>arr[mid]){
                            end = mid-1;
                        } else{
                            start = mid+1;
                        }
                    }
                }
                return -1;
            }
}
