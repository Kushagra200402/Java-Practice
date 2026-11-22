import java.util.ArrayList;
import java.util.Scanner;

public class InputInArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(2);
        System.out.println("Input values in ArrayList");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

//        get item at any index
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i));  //pass index here, list[index] will not work here
//        }

        System.out.println(list);
        System.out.println(list.get(2));
        /* Working of ArrayList
        ArrayList basically has fixed size in memory. But when you start inputing the values and it reaches somewhat more than 50%
        of the capacity, its just create new array of double the size of previous one and copy all the values into new one.

        Still it's time complexity is O(1).
         */
    }
}
