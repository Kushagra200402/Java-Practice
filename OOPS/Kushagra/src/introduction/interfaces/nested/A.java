package introduction.interfaces.nested;

public class A {
    // nested interface
    public interface NestedInterface {
        boolean IsOdd(int num);
        // nested interface can be declared as public, private or protected but the top interface can only be declared as public or default.
    }
}
class B implements A.NestedInterface {
    @Override
    public boolean IsOdd(int num) {
        return (num & 1) == 1;
    }
}

class Main{
    public static void main(String[] args) {
        B obj1 = new B();
        System.out.println(obj1.IsOdd(38));
    }
}
