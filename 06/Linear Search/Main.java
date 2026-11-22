public class Main {
    public static void main(String[] args) {
        int[] A = {6, 89, 26, 43, 5, 9, 21, 90, 19, 47, 39, 30};
        int search_element = 19;
        int ans = linearSearch(A, search_element);
        System.out.println("target element "+search_element+" found at index value "+ans);
        System.out.println(linearSearch2(A, search_element));
    }
//    Search in the array: Return the index if item found
//    otherwise if item not found return -1;
    static int linearSearch(int[] arr, int target){
        if(arr.length==0)
            return -1;

//        run a for loop
        for (int index = 0; index < arr.length; index++) {
//            check for every element at index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
//        this line will execute if none of the return statements above have executed
//        hence the target not found
        return -1;
    }

    static boolean linearSearch2(int[] arr, int target){
        if(arr.length==0)
            return false;

//        run a for each loop
        for (int element :
                arr) {
            if (element == target)
                return true;
        }
//        this line will execute if none of the return statements above have executed
//        hence the target not found
        return false;
    }
}


//Time Complexity: As the size of input is growing, how the time in program execution is growing that is called time complexity
//Space Complexity: Are you taking any extra space? Auxillary Space: means extra space being taken.