import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
//        create an array
        int[] arr = {1, 23, 53, 89, 0};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 96;  // If you make a change to the object via this reference variable, same object will be changed
    } //This is not pass by reference, this is pass by copy of the value of the reference
}
