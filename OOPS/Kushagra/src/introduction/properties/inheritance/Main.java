package introduction.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box cube = new Box(4);
        Box cuboid = new Box(2.3, 4.5, 6.2);
        Box box1 = new Box(box);

//        System.out.println(box.l+", "+box.w+", "+box.h);
//        System.out.println(cube.l+", "+cube.w+", "+cube.h);
//        System.out.println(cuboid.l+", "+cuboid.w+", "+cuboid.h);
//        System.out.println(box1.l+", "+box1.w+", "+box1.h);

        BoxWeight box2 = new BoxWeight();
        BoxWeight box3 = new BoxWeight(3, 2, 5, 6);
        System.out.println(box2.h+", "+box2.weight);
//        System.out.println(box3.l+", "+box3.w+", "+box3.h+", "+box3.weight);

        //try sth new: reference variable of type parent class calling constructor of child class
        Box box4 = new BoxWeight(4, 2, 5, 8);
//        It is reference type of Box and it is referencing to an object of type BoxWeight
        System.out.println(box4.w); // will be printed
//        System.out.println(box4.weight); //will throw error
        // Important to understand that it is actually the type of reference variable (not the type of object) that determines what members
        // can be accessed.

//        BoxWeight box5 = new Box(3, 5, 6);
//        there are many variables in both child and parent classes.
//        You are given access to variables that are in reference type i.e. BoxWeight.
//        Hence you should have access to weight variable.
//        This also means, that the ones you are trying to access should be initialised.
//        But here, when object itself is of type parent class, how will you call the constructor of child class
//        Since the Box constructor has no idea about weight variable, then how you will initialize that - Hence it is giving an error.
//        So you can't have a child reference variable and a parent object

        BoxPrice box5 = new BoxPrice(5, 45, 455);
        System.out.println(box5);
        BoxColour box6 = new BoxColour(5, 34, "cian");
        System.out.println(box6.colour);

        box4.greetings(); //Although you can print static method through objects
        Box.greetings(); //but the convention is to print by class name

        Box box7 = new BoxWeight();
        box7.greetings(); //It is not calling the greetings method inside the BoxWeight class but the method inside in box class
        /*
        Although static methods are being inherited, there is no point in overriding them in child class because the method in parent
        class will always run no matter from which object you call it. Because its static, it is not dependent on objects.
        That is the reason that static methods inside the BoxWeight class is not being called.
        So static methods can be inherited but you can't override them.
        "Overriding depends on objects, static does not depend on object Hence static can't be overridden"
         */
        BoxWeight.greetings();//directly call from class, if you want that static method to run
        //Note: Polymorhism does not apply on instance variables

        System.out.println(box.getL());
        //We are able to access the private member l of box class because we are accessing it through its method only.
        // This is called getter, using this we can access the hidden data.
        // Difference b/w data hiding and encapsulation is that data hiding is about data security while encapsulation is about
        // hiding the complexity of the system. To achieve data hiding, data must be private while for encapsulation, data can be
        // public, protected also. Encapsulation is sub process of data hiding. Data hiding is achieved via encapsulation.
    }
}
