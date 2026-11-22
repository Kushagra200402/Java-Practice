package introduction.abstractDemo;

public class Main {
    public static void main(String[] args){
        Son son = new Son(34);
        son.career("coder");
        son.partner();

        Daughter daughter = new Daughter(25);
        daughter.career("athlete");
        daughter.partner();

//        Parent mom = new Parent(50); // You can't create objects of an abstract class like this. It will ask to override it.
        // It is also because when you will call the method inside the abstract class, it will throw error because there is no body of method.
        // for the same reason you can't create abstract constructors.

        // Can you create abstract static methods?
        // Do static methods get overridden? no, then what is the point of creating abstract static methods. Abstract methods are meant to be overridden.
        // But you can create static methods in abstract classes.
        // You can't create object of abstract classes but static methods aren't called through object. We directly call them using class name.
        Parent.hello();
        son.normal();
        daughter.normal();

        // Although you can't create an object of abstract class but you can use it as the type of reference variable.
        Parent daughter1 = new Daughter(12);
        System.out.println(Son.relation);
//        System.out.println(Parent.VALUE);
        // Since which method is going to be called depends on type of object. This we have studied in run time polymorphism known as "upcasting".
    }
}
