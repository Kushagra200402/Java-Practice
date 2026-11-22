package introduction.staticExample;

public class Main {
    public static void main(String[] args) {
        Human luv = new Human(21, "luv ranjan", 1000, true);
        Human vir = new Human(23, "vir das", 900, false);
        Human sri = new Human(13, "sri", 300, false);

        System.out.println(luv.name);
//        System.out.println(luv.population);
//        System.out.println(vir.population); // population will be same for luv and vir both
        System.out.println(Human.population); // you can access the static variable through objects also but the convention is to use class
        // static variables aren't dependent on objects
        // You can declare variable and methonds both as static. Most popular method amongst them is "public static void main"
        // main function is always static because main is the first function which runs when we run the program.
        // so in order to run the program, if main is not static, we need to create an object to run that class.
        // but how can you create an object to run the program, when the main is very first thing that is running.
        // Hence you should be able to run the main function w/o creating an object of this class Main.

        // So Static variables or methods belong to the class, not to the objects.
        fun();
    }

    // this is not dependent on objects
    static void fun(){
//         greeting(); // A static method can only access static data. Because a non-static thing belongs to an object.
//        You can't use this because it requires an instance but the function you are using it in does not depend on instances.
//        so you can not access a non-static method inside a static method w/o explicitly mentioning an object referenced to it.

        // You can't access non-static stuff w/o referencing their instances in static context.
//         Hence I am referencing it.
        Main obj = new Main(); // way to access greeting method
        obj.greeting();
    }

    void fun2(){
        // from non-static method, you can call it directly
        greeting();
    }
    // this is dependent on objects. Something which is not static, belongs to an object.
   void greeting(){
//        fun(); // but a static method can be accessed inside a non-static method.
        System.out.println("Hi! how are you?");
    }
}
