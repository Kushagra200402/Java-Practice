import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Kushagra Singh Tiwari";
        name.
        System.out.println(Arrays.toString(name.toCharArray()));
        name.toLowerCase();  // It won't change the original object, since strings are immutable
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('r'));
        System.out.println("   Kushagra  ".strip());  //remove the spaces
        System.out.println(Arrays.toString(name.split(" "))); //spliting the string
    }
}
