package introduction.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
        this.age = age; // Write when you don't have constructor in parent class
//        super(age);
        System.out.println(this.VALUE);
    }

    @Override
    void career(String name){
        System.out.println("I want to be a "+name);
    }

    @Override
    void partner(){
        System.out.println("I love Steve rogers");
    }
}
