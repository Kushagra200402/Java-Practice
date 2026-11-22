package introduction.staticExample;

//This is demo to show initialization of static variables
public class StaticInt {
    static int a = 4;
    static int b;

//    Will only run once, when the first object is created i.e. when the class is loaded for first time
    static {
        System.out.println("I am in static block");
        b = a * 4;
    }
    public static void main(String[] args) {
//        System.out.println(a+" "+b);
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);

        StaticInt.b += 3;
        System.out.println(StaticInt.a+" "+StaticInt.b);

        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);
    }
}
