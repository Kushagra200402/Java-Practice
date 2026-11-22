import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input any 3 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        Find the largest of three numbers
//        if(a>b){
//            if(a>c){
//                System.out.println(a+" is greatest");
//            }else if(b>c){
//                System.out.println(b+" is greatest");
//            }else{
//                System.out.println(c+" is greatest");
//            }

//        Second method
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max+" is maximum");


//        Java method
//        int max = Math.max(c, Math.max(a, b));
//        System.out.println(max+" is maximum");
    }
}
