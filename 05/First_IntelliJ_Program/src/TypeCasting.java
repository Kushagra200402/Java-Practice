import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println("Actual number is "+ num);
////        Type Casting
//        int num1 = (int) num;
//        System.out.println("After typecasting to an integer: "+ num1);

//        Automatic type promotion in expressions
//        int a = 258;
//        byte b = (byte)(a); // 258 % 256 = 2;
//        System.out.println(b);

//        byte x = 40;
//        byte y = 50;
//        byte z = 100;
//        int w = x*y/z;
//
//        System.out.println(w);

//        byte b = 40;
//        b = b+2;  //Error as b promoted into an integer in this line

//        int number = 'B';
//        System.out.println(number);  // ASCII value of 'B'
        System.out.println("नमस्ते"); //Java works on unicode values

        byte b = 32;
        short s = 12;
        char c = 'g';
        int i = 69 ;
        float f = 45.56f;
        double d = 67.345;

        double res = (f*b)- (i/c) + (d*s);
//        float - int + double = double
        System.out.println((f*b) +" "+ (i/c) +" "+ (d*s));
        System.out.println(res);
    }
}
