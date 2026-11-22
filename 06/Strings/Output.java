import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56); // Here it is not showing toString method
        // But if we show it into a wrapper class
        Integer num = new Integer(56);
//        If you put it in wrapper class you can use so many functions that is not possible with int because int is not an object, it is primitive
        System.out.println(num.toString()); // Here toString() method call is unnecessary because it will automatically print in String

        System.out.println("Kushagra");

//        System.out.println(new int[]{3, 5, 8, 9}); //printing some random value
        System.out.println(Arrays.toString(new int[]{3, 5, 8, 9}));
//        Here we are using toString method of Arrays Class of java (original toString method is overridden)
//        Whatever you put under println method(does not matter which data-type) it will print string only

        String name = null;
        System.out.println(name);

//        Always primitives are stored in stack memory
//        And objects are stored in heap memory (In python everything is an object(everything is in heap)
    }
}
