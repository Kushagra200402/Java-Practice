import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {5, 8, 23, 9};  //'nums' is a reference variable pointing to the object of an array
        System.out.println("'nums' array before change function");
        System.out.println(Arrays.toString(nums));
        change(nums); // copy of the 'nums' variable is passed to the change function
        System.out.println("\n'nums' array after change function");
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){ //copy of the 'nums' variable is 'arr'
        arr[0] = 34;
    }
    //'nums' and 'arr' both reference variable are pointing to the same object that's why change in 'arr' will reflect
    // in 'nums'. This is called 'MUTABILITY'(Mutable behaviour).
    //Strings are 'IMMUTABLE'  in java while Arrays are 'MUTABLE' in java.
    // 'MUTABLE' means 'You can change the object'.
}
