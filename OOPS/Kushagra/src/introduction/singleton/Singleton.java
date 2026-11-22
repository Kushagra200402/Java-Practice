package introduction.singleton;

// Singleton class is a class for which you can create only one instance.
public class Singleton {
    // To make sure that only one object can be created of a class, you've to make sure that nobody can it's constructor. so we will make it private.
    private Singleton(){

    }
    // I only need one instance
    private static Singleton instance;
    // The goal is to create only one instance. So we will create a function which will give us that instance.
    public static Singleton getInstance(){
//        Check whether only one object is created or not
        if(instance == null){
            // If not then create it.
            instance = new Singleton();
        }
        return instance;
    }

}
