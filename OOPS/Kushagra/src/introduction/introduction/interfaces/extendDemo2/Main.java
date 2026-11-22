package introduction.introduction.interfaces.extendDemo2;

public class Main implements B {
    @Override  // annotations are also interfaces
    public void fun(){
        System.out.println("normal function it is");
    }
    @Override
    public void greet(){
        System.out.println("Hi Everyone!");
    }
    public static void main(String[] args){
        B obj1 = new Main();
        obj1.fun();
        obj1.greet();
    }
}
