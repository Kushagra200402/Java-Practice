package introduction.interfaces.extendDemo2.extendDemo;

public interface B extends A{
    public void greet();

//    default void fun(){
//        System.out.println("I am in interface A");
//    };
    // Since we've learned that in an interface, a function can't have body but here it is present.
    // This is special use feature provided in java8. This method is not overridden here but still it is not giving error because
    // There is a default over there before method type. But if we try to implement both interfaces in Main class, it will give an
    // error because of same name (Eventually it is creating the same problem here which we were trying to solve using interfaces).
    // So what is the purpose of this?
    // The primary motivation behind this default method was to provide means by which the interfaces could be expanded without breaking
    // the existing code. So for eg. you've added another method without a body in interface so then you would've to provide the body in
    // all the classes that implement the interface.
}

// interface to class inheritance --> implements
// interface to interface inheritance --> extends
