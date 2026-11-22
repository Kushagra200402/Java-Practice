//Shadowing in java is basically a practice of using two vairables with the same name within the scope that overlaps

public class Shadowing {
    static int x = 89; //This will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);  // Output: 90
        int x;  //x is declared: The class variable at line 4 will be shadowed by this
//        System.out.println(x);  //Error: Scope will begin when the value is initialized
        x = 56;  // x is initialized
        System.out.println(x);  // Output: 56
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
