package introduction.interfaces;

public class Main {
    public static void main(String[] args){
        Car car = new Car();
        // Can you put type of reference variable as type of interface (like parent or child classes)
        Engine car1 = new Car(); // Yes you can
//        car1.a; // you can't access the variable inside the Car class
//        What you can access depends on type of reference varible (left side).
//        Which one of those versions you can access depends upon the type of object (right side).
        car.start();
        car.acc();
        car.brake();
        car.acc();
        Media carMedia = new Car();
        carMedia.start();

        NiceCar bugati = new NiceCar();
        bugati.start();
        bugati.stop();
        bugati.startMusic();
        bugati.stopMusic();
        bugati.upgradeEngine();
        bugati.start();
    }
}

// When you have the same function in parent class and child class then both the classes have to be present at the compile time so that
// java compiler can check that everything is compatible or not. So this way, for more functions to be available in child classes the function
// get pushed up higher and higher in parent classes. This is the problem that interfaces solve. How?
// They disconnect the definition of a method from this hierarchy of inheritance because you are implementing it in some class only.
// So interfaces are not like the hierarchy of the classes (like the way inheritance work).
// Two classes that are unrelated to each other, they can also implement the same interface (irrespective of who are their parent classes).
// This is the place where the power of interfaces shines.
//Interfaces should generally be avoided in performance critical code because they introduce additional overheads compared to direct calls
// to concrete implementations, primarily due to dynamic dispatch and indirection.This dynamic lookup of method at runtime has little bit of
// overhead when compared to normal method invocation in java.
// That is why you should be careful not use interfaces casually in performance critical code.
// Interfaces typically use virtual method calls, which are resolved at runtime rather than compile time. This dynamic dispatch is slower than
// direct calls, and if interface methods are called in tight loops or performance-critical paths, the extra cost may be significant.
