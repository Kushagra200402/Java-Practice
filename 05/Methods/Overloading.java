public class Overloading {
    public static void main(String[] args) {
//        fun(34);
//        fun("Kushagra Singh Tiwari");
        int ans = sum(4, 5, 8);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}

//Function Overloading: Two functions of same name can coexist if each of them has different set of parameters.
//Function overloading happens at Compile time when it identifies the type of the arguments. Either the number of arguments or type of arguments should be different.

