import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 7, 23, 63, 8, 9) ;
        multiple(4,6,"Suraj", "Utsav", "Om");
//        demo(3,53,2, 6, 64);
        demo("Ethan Hunt", "John Wick", "James Bond", "Brian O'Conner");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...s){  //Valid. Also varargs should be last parameter as we don't know how many number of arguments are there.

    }
}

//    Variable Arguments in Java simplifies the creation of methods that need to take a variable number of arguments.
