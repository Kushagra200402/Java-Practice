package introduction.abstractDemo;

public class Son extends Parent{

    public Son(int age){
        this.age = age; // If you don't have constructor in Parent class
//        super(age);
    }
    @Override
    void career(String name){
        System.out.println("I am going to be a "+name);
    }

    @Override
    void partner(){
        System.out.println("I love Ana");
    }

    // you can override the normal method of parent class also (not mandatory).
    @Override
    void normal(){
//        System.out.println("Normal method overridden");
//        super.normal();
    }
}
