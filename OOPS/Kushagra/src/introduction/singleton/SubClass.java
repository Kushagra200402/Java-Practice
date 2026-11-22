package introduction.singleton;

import introduction.access.A;

public class SubClass extends A {
    public SubClass(int n, String name){
        super(n, name);
    }

    public static void main(String[] args){
        SubClass obj = new SubClass(13, "Rutu");
        A obj1 = new A(2, "gg");
        int a = obj.num; // this proves that we can access the protected variable in a subclass of different package too
//        int b = obj1.num;  // See here even base class can't access it's protected member if it is outside the package

        System.out.println(obj instanceof SubClass);
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof SubSubClass);
        System.out.println(obj instanceof Object); // Every object is an instance of the Object class
    }
}

class SubSubClass extends SubClass {
    public SubSubClass(int n, String name){
        super(n, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(13, "Riti");
        int a = obj.num; // A subclass of subclass can also access the protected member
    }
}

class SubClass2 extends A { // There can be only public class in the file that too will be same as the name of java file.
    // If you want to make this class public then you must create the separate file named SubClass2.java for this class.
    public SubClass2(int n, String name){
        super(n, name);
    }

    public static void main(String[] args){
        SubClass2 obj = new SubClass2(13, "Rutu");
        int a = obj.num;
    }
}