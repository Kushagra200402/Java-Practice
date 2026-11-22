package introduction.staticExample;

class Test0{
    static String name;
    public Test0(String name){
        Test0.name = name;
    }
}

// outer class can never be static. because it is not dependent on any other class
public class InnerClasses {
// only inner classes can be static
    class Test1{
        String name;
        public Test1(String name){
            this.name = name;
        }
    }
    static class Test2{
        static String name;
//        String name;
        public Test2(String name){
            Test2.name = name;
        }
//        public Test2(String name){
//            this.name = name;
//        }
        @Override
        public String toString(){
            return name;
        }
    }

    // Since static things are independent of objects and objects are created at runtime hence static things are resolved during compile time.
    // Static methods are class level methods.

    public static void main(String[] args) {
//        Test1 a = new Test1("Kush"); //You can't do it because the Test1 class is dependent on class InnerClasses and it's not static
        Test2 b = new Test2("Rahul");
        Test2 e = new Test2("Tilak");
        Test0 c = new Test0("joe"); //It won't throw error since the Test0 is independent of InnerClasses4
        Test0 d = new Test0("Siya");

//        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(e.name);
//Static means that the class is not dependent on the objects of outer class but that doesn't mean that the inner class can't have its own objects.
// Both the inner class and the main function can have instances of each other even if the inner class is static.
// So the inner class's objects can have their own identity.

        System.out.println(c.name);
        System.out.println(d.name); // Since name is static so it is independent of object, if you change for one, will change for another
        // that's why c.name and d.name is = "Siya"
        System.out.println(b);
    }
}