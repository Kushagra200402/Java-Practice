public class Main {
    public static void main(String[] args) {
//        Array is a collection of items of similar data type
//        Syntax of an Array
//        datatype[] variable_name = new datatype[size];

//        for eg: Store 5 roll numbers
        int rno[] = new int[5]; // All the values will be initialized to 0.
        for (int i = 0; i < 5; i++) {
            System.out.println(rno[i]);
        }
//        or directly
        int rnos[] = {45, 12, 9, 29, 11};

//        breaking down the structure
        int[] rollno;   //declaration of an array. rollno is getting defined in the stack
        rollno = new int[5]; //initialization of the array. actually here object is being created in memory (heap)
        /*
        * int[] : datatype
        * rollno : reference variable, both the things happen in compile time.
        * new int[n]: creating the object in heap memory. this thing happen during runtime, Called "Dynamic Memory Allocation".
        * Dynamic Memory Allocation: Assigning the memory space during the execution time or runtime.
        * 'new' keyword: 'new' is used to create an object. here 'new' is creating an array object.
        *
        */

        String[] arr = new String[4]; // All the values will be initialized to 'null'. 'null' is a special literal same as 'none' in python. Only assigned to non primitive data type.
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }

        //Using for each loop for printing
        for (String a:arr)
        {
            System.out.println(a);
        }
    }
}
