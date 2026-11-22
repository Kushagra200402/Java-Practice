import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//        initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());  // 3 ArrayLists have been added
        }
//        If you don't initialize ArrayList then java will throw an error

//        add elements
        Scanner in = new Scanner(System.in);
        System.out.println("Add elements to the list");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());  // Get the list of index i and add elements to it.
            }
        }

        System.out.println(list);
    }
}
