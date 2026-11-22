public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 53, 42, 2, 6}; //Reference variable arr is in stack and it is pointing to this object({3, 53, 42, 2, 6}) in heap.
//        Any particular change via arr will result in change of main object.
        int a = 10; //'a' is a reference variable of type 'int'. primitive type so it is stored in stack.
        String name = "Kushagra Singh Tiwari"; //'name' is a reference variable of type 'String'. "Kushagra Singh Tiwari" is an object.
        System.out.println(name);

        String b = "Kunal";
        System.out.println(b);
        b = "Kushwaha";
        System.out.println(b); //Here I am not changing the object, but creating a new object called "Kushwaha" and object "Kunal" went" into Garbage Collection
    }
}

// Everything that starts with capital letter is a class. Ctrl + click on class name to know more about the class.
// String is most commonly used class in java's class library

//String Pool: Separate memory structure inside the heap.
//Strings are "Immutable" in JAVA i.e. you can't change or modify the object