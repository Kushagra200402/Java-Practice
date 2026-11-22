import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        Array of Primitives
        int[] arr = new int[5];
        //Normal Input
//        arr[0] = 8;
//        arr[1] = 28;
//        arr[2] = 90;
//        arr[3] = 88;
//        arr[4] = 6;
//        System.out.println(arr[3]);
        Scanner in = new Scanner(System.in);
        System.out.println("Input values in the array");
        //Input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        //Output
        System.out.println("Output using for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //Output using for each loop
        System.out.println("\nOutput using for each loop");
        for(int num : arr){   // for every element in the array, print the element
            System.out.print(num + " ");  // here num represents element of the array
        }

        /* Syntax:
        for(datatype variable_name : reference variable){
                //Code
         }
         */

        // Another way to print: using toString method
        System.out.println("\nOutput using toString method");
        System.out.println(Arrays.toString(arr)); // It simply converts into string and print it.

//        Array of Objects
        System.out.println("String Inputs");
        String[] str = new String[5];  //This is storing reference variables to the object and these objects can be stored anywhere in the heap
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println("\nString Outputs");
        System.out.println(Arrays.toString(str));

        //You can also modify values
        System.out.println("Modified string");
        str[3] = "Happy";
        System.out.println(Arrays.toString(str));
    }
}
