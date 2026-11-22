package introduction.singleton;

import introduction.access.A;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton(); // we can't call it since the constructor is private;
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
//        All 3 reference variables are pointing to just one object.

        A a = new A(12, "Lee");
        a.getNum();
    }
}
