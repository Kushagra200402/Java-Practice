package introduction.access;

public class SubClass extends A{
    public SubClass(int n, String name){
        super(n, name);
    }

    public static void main(String[] args){
        SubClass obj = new SubClass(13, "Rutu");
        int a = obj.num; // this proves that we can access the protected variable in a subclass of same package
        A obj1 = new A(2, "gg");
        int b = obj1.num; // you can protected member through base class also if it is same package
    }
}
