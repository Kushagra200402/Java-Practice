package introduction.abstractDemo;

public abstract class Parent {

    int age;
    final int VALUE = 2431; // We can have final variable in abstract class
    static String relation = "Guardian"; // also static variables

    // It may be thought that what is the point of having parent class constructor since we are using it.
    // Well when we have final variable then we can initialize it through constructor.
//    public Parent(int age){
//        this.age = age;
//        VALUE = 2451;
//    }

//    abstract Parent();  // You can't create abstract constructor
    abstract void career(String name);
    abstract void partner();

    // Can you create static methods in abstract classes? yes, you can.
    static void hello(){
        System.out.println("Hi Everyone!");
    }

    // Can abstract classes have normal methods? yes, they can.
    void normal(){
        System.out.println("This is normal method");
    }

    // Why to do this: this makes code clean
    // If you know the method is going to be overridden by the subclasses then make it abstract
    // If atleast one of the methods is abstract then the class has to be abstract class.
}

// Can you have final abstract class?
// No, common sense. Because final class can't be inherited.
// It still does not support multiple inheritance. We can't inherit two classes in a single class because it allows here to have normal
// methods in parent class so what if we have multiple normal methods of same name with different body in different classes then how we
// will identify which one to override in child class.
// So for multiple inheritance we have a concept called "Interface" in java.
