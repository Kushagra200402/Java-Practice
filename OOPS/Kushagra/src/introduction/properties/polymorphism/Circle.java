package introduction.properties.polymorphism;

public class Circle extends Shapes{
    // This will run when object of circle is created
    // Hence this is overriding parent class method area().

    @Override // This is annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }

//    @Override //here it will give an error because there is no method called area2 in superclass.
//    void area2(){
//        System.out.println("Area is pie * r * r");
//    }
}
