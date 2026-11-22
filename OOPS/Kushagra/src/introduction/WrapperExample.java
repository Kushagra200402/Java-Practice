package introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;  // This is premitive
        int b = 20;
//        Integer num = new Integer(11); // This is object
        Integer num1 = 11; // This is also (another way of defining int as an object using wrapper class 'Integer').
        Integer num2 = 21;
        System.out.println(a);
        System.out.println(num1);

        swap1(a, b);
        swap2(num1, num2);
        System.out.println("a="+a+",b="+b); // it won't swap because there is no pass by reference in java.
        System.out.println("num1="+num1+",num2="+num2);

        final int x = 2;
//        x = 3; //It will throw error because you can't assign value to final variable.

        final A obj = new A("Kushagra Tiwari");
        obj.name = "Happy Tiwari"; //you can do this

        A obj2;

        // It will print "Object is destroyed" since memory was set free from old values.
        // This proves that garbage collector is destroying the objects.
        for(int i=0; i<1000000; i++){
            obj2 = new A("something");
        }

        // When a non primitive is final, you can't reassign it.
//        obj = new A("Random"); //but this you can't since this is final

    }

    // Here a and b is not passed, the value of a and b are passed.
    // So the changes in a and b will be inside this function only.
    static void swap1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    // When we pass the object then we are passing by reference (means address of a value).
    // But still it won't swap becuase Integer is a final class.
    // final is a keyword that is used when you don't want to modify the value of a variable, you wanna keep it static.
    // You've to initialize the final variable while declaring it because you want to keep this static.
    // Final guarantees immutability only when the instance variables are of primitive data types not of reference types
    // or object types.
    static void swap2(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int num = 23;
    String name;

    public A(String name){
      this.name = name;
    }

    // finalize performs action when the object is destructed by garbage collector.
    // Garbage collection in java is automatic unlike cpp but you can ask to print msg or do some task manually using finalize
    // once the object is destroyed.
    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("Object is destroyed");
    }
}
