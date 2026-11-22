import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /* Suppose you wanna print matrix like this:
                1 2 4
                7 9 2
                1 6 5

           Then we use 2D array.
         */
        int[][] arr = new int[3][]; // In initialization of 2D array, you need not to specify no. of columns but rows are mandatory.

//        2D array is an array of arrays. Different arrays can have different no. of elements i.e. different no. of columns.
//        So it is not mandatory to specify no. of columns at the time of initialization.
//        hard coded inputs
        int[][] nums= {
            {1, 4, 5},      //nums[0] has 3 columns. nums[1][0] = 1;
            {2, 3},         //nums[1] has 2 columns.
            {7, 8, 0, 9}    //nums[2] has 4 columns.
        };

        // Input in 2D array
        Scanner in = new Scanner(System.in);
        int arr2[][] = new int[3][2];
        System.out.println("length of the array: "+arr.length); //It will print no. of rows
        System.out.println("Input values in the array");
        for (int row = 0; row < arr2.length; row++) {
//            for each column in every row
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = in.nextInt();
            }
        }

        //Output
        System.out.println("Your matrix");
        for (int row = 0; row < arr2.length; row++) {
//            for each column in every row
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("Using toString method");
        for (int row = 0; row < arr2.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));
        }

        System.out.println("Using enhanced for loop");
        for (int[] a: arr2) { //Here each element of array 'arr2' is an array itself hence the datatype is int[].
            System.out.println(Arrays.toString(a));
        }
    }
}
