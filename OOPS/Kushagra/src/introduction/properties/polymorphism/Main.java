package introduction.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes shape2 = new Square();

        shape.area();
        circle.area();
        square.area();
        shape2.area(); //will print square area since object is of type square (and reference variable is of type Shapes)
//        Polymorphism: Act of representing the same thing in multiple ways
//      But as we learned what variables or methods can be accessed depends on type of reference variable then why it is calling Square constructor
//         Here, type of method that is going to override depends on the type of object. Here the actual statement is not defied.
//        If you remove area from parent class shapes then it will give error here because it will check area method in Shapes class only
//        But eventually it is going to be overridden by the square method. So what method it can access still depends on type of reference
//        variable but what it will access will depend on the type of object.
//        Reference type defines which one to access and Object type defines which one to run
    }
}
