import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');   // will print sum of ASCII values of a and b
        System.out.println("a"+"b");   // concatenate string
        System.out.println('a'+5);
        System.out.println((char)('a'+5));

        System.out.println("a" + 8);
        // This is same as after few steps: "a" + "1"
        // integer will be converted to Integer class that will call method toString()

        System.out.println("Kushagra" + new ArrayList<>());
        System.out.println("Dafa" + new Integer(406));

//        System.out.println(new Integer(45) + new ArrayList<>());  //Error
        System.out.println(new Integer(45) + " " + new ArrayList<>());
        // Using '+' operator will work with non-primitives only if one of them is of type string.


    }
}

// Primitives are stored in stack acquire less memory
// Non primitives are stored in heap occupy large memory