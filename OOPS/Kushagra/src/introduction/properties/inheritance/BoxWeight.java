package introduction.properties.inheritance;

// New box BoxWeight has extra property as weight but it has normal Box properties also so it will inherit those properties from Box.
public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -2;
    }

    BoxWeight (BoxWeight other){
        super(other);  //super is calling copy constructor of Box. But the other is of type BoxWeight. If you've BoxWeight type here, it will have
        // access to all other 3 variables which are in box only (since it is child class). Because what is accessed is based on the type of
        // reference variable not the type of object. This is exactly same as "Box box4 = new BoxWeight(4, 2, 5, 8);" in main class.
        // So super class variable can be used to reference any object from derived class. Hence we are able to pass BoxWeight object to Box constructor.
        weight = other.weight;
    }

    public BoxWeight(double length, double height, double width, double weight){
        super(length, height, width); //This is calling parent class constructor - used to initialise values present in parent class
//        This won't throw error even if any member is private because here parent class construtor is running which can access private variables too
        this.weight = weight;
//        Note: Although a subclass can access all the things of parent class but it won't be able to access those members of parent class
//        which have been declared as private (You can't use a private member outside of a class)

        // 2nd use case of super
        // If you want to use parent class instance variable explicitly
//        System.out.println(super.l);
        System.out.println(this.weight); // pointing to child class weight
//        System.out.println(super.weight); // pointing to parent class weight

        //In the hierarchy of the classes if a super class constructor requires parameters then all the subclasses must pass those parameters.
        // Super class does not know or care about what child class contains but child class does care about it that's why
        // parent class instance variables need to initialized first before child class. It will give an error if you initialize
        // after it.
//        super(length, height, width); //Error: Call to 'super()' must be first statement of constructor body
//        If you do not call parent class constructor in child class then default constructor will be called
    }

    BoxWeight(double side, double wght){
        super(side);
        this.weight = wght;
    }

    //Trying overriding static method
//    @Override //Giving an error, not overriding
    static void greetings(){
        System.out.println("Hey I am in BoxWeight class, Greetings!");
    }

}

// Tried to implement multiple inheritance, didn't work
//public class BoxWeight extends SolidBox{
//
//}
