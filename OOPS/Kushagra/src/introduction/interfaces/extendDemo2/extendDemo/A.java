package introduction.interfaces.extendDemo2.extendDemo;

public interface A {
    default void fun(){
        System.out.println("I am in interface A");
    };

    // static interface methods should always have a body in interface itself
    // Call via interface name
    static void greeting(){
        System.out.println("Hey I am in static method.");
    }
    // Since static methods can't get inherited (You can't override them)
}
