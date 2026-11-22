package introduction.properties.polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am in Shapes");
    }

//    Early Binding
//    final void area(){
//        System.out.println("I am in Shapes");
//    }
    //    You can also use final keyword to prevent overriding. you cannot override a method that is final
//    because methods which are declared as final can somehow provide a performance enhancement, because the compiler is free to enline the calls
//    to them because the compiler will know that these methods will not be overridden. Since overriding happens in run time so when the final
//    method is called, java compiler can copy the bytecode directly with compiled code of calling method hence eliminating the overhead associated
//    associated with this method call like which one to resolve. Since this is final method, this is the only method to resolve

//    Since override happens runtime after all the compilation process so it is also know as "Late Binding"
//    However since the final method can't be overridden. A call to one can be resolved at compile time only, so it is called "Early Binding".

//You can also use final to prevent Inheritance. Sometimes you would want to prevent a class to be inherited so for that you can make it final.
//    When you put a class as final then implicitly you are declaring its methods also as final
}
