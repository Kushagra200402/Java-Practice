public class PassingEg {
    public static void main(String[] args) {
        String name = "Kushagra Singh Tiwari";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String naam) {
        naam = "Sachin Tendulkar";       // creating a new object
//        variable 'naam' can be accessed only over here(this function)
    }
}
/* Two data types
* primitives: int, short, char, byte.... etc. (just pass by value only).
* objects and stuff: passing value of the reference variable.
* */