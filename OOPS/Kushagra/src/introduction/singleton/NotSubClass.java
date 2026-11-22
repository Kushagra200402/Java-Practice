package introduction.singleton;

import introduction.access.A;

public class NotSubClass {

    public static void main(String[] Args){
        NotSubClass obj = new NotSubClass();
        A obj1 = new A(25, "True");
//        int a = obj1.num; // not able to access protected variable
        String s =obj1.name; // able to access the public variable
    }
}
