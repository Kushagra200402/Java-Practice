import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Principle, time(in years) and rate");
        int p = in.nextInt();
        int t = in.nextInt();
        float r = in.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("Simple Interest = "+si);
    }
}
