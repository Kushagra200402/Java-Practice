import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//  When you don't want to specify size of an array and just want to enter the values in as many as you want then you can use 'ArrayList'.
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // OR
//        ArrayList<Integer> list2 = new ArrayList<Integer>(10); // You can do this also but it is not mandatory to specify wrapper class not datatype(for 'int' wrapper class is 'Integer') in second position(RHS).

//        Input values in the list
        list.add(78);
        list.add(18);
        list.add(70);
        list.add(782);
        list.add(8);
        list.add(7);
        list.add(72);
        list.add(68);
        list.add(90);
        list.add(71);
        list.add(748);
        list.add(12);
        list.add(74);
        list.add(82);
        list.add(82);
        list.add(70);
        list.add(72);
        list.add(68);
        list.add(90);
        list.add(71);

        System.out.println(list); //Internally list is calling toString method(more about this later in oop lectures).
        System.out.println(list.contains(34)); //Asking does list contain 34? Output: 'false'
        System.out.println(list.contains(74)); //print 'true'

        list.set(1, 12); //If you want to set 1st index value to 12
        System.out.println(list);
        list.remove(3); //If you want to remove index no. 3
        System.out.println(list);

    }
}
