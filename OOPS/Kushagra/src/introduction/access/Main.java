package introduction.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(11, "Jiva");
//        Need to do few things
//        1. Access the data members
//        2. Modify the data members

        obj.getNum();
        int n = obj.num; //protected can be used inside the package in different class too

        ArrayList<Integer> list = new ArrayList<>(5);
//        list.DEFAULT_CAPACITY; // If you see almost all the variables for ArrayList class have private access .
//        Private variables you can access and modify using getter and setter
    }
}

// Its not a good convention to allow the access of internal variables of a class directly.
