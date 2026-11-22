package introduction.interfaces.extendDemo2.extendDemo;

public class Main implements B, A {
    // overridden methods in child class can't have weaker access privilege than the parent class (It only can have same or better).
    @Override
    public void fun(){ //If you remove public here it will give an error since in parent class it is declared as public.
        System.out.println("normal function it is");
    }
    @Override
    public void greet(){
        System.out.println("Hi Everyone!");
    }
    public static void main(String[] args){
//        B obj1 = new Main();
//        obj1.fun();
//        obj1.greet();

         A obj2 = new Main();
        A.greeting();
    }
}
