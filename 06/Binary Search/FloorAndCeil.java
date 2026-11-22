public class FloorAndCeil {
    public static void main(String[] args){
        int[] arr = {-23, -11, -8, -2, 0, 7, 13, 27, 45, 77, 98};
        int target = -35;

        int floor = Floor(arr, target);
        if(floor==-1){
            System.out.println("floor("+target+") = "+"Does not exist in the array");
        }else{
            System.out.println("floor("+target+") = "+floor);
        }

//        int ceil = Ceil(arr, target);
//        if(ceil==-1){
//            System.out.println("ceil("+target+") = "+"Does not Exist in the array");
//        }else{
//            System.out.println("ceil("+target+") = "+ceil);
//        }

    }

    //CEIL: Smallest number in the array which is greater than or equal to the target number.
//    static int Ceil(int[] arr, int target){
//        int start = 0;
//        int end = arr.length - 1;
//
//        if(target > arr[end]){
//            return -1;
//        }
//        while(start<=end){
//            int mid = start + (end - start)/2;
//            if(target == arr[mid]){
//                return arr[mid];
//            } else if (target < arr[mid]) {
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return arr[start];
//    }

    //FLOOR: Greatest number in the array smaller than or equal to the target element
    static int Floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(target < arr[start]){
            return -1;
        }
        while (start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}


