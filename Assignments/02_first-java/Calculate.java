import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 2 numbers");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float result = 0;
        System.out.println("Input the operator(+, -, * or /)");
        char op = in.next().trim().charAt(0);

        if(op != '+' || op != '-' || op != '*' || op != '/'){
            System.out.println("Invalid Input!");
        }else {
            if (op == '+') {
                result = a + b;
            }
            if (op == '-') {
                result = a - b;
            }
            if (op == '*') {
                result = a * b;
            }
            if (op == '/') {
                result = a / b;
            }
            System.out.println("Answer = "+result);
        }
    }
}
