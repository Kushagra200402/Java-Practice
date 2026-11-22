import java.util.Scanner;

public class RupeeInDollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rupees");
        float rupee = in.nextFloat();
        float dollar = (float) 0.012 * rupee;
        System.out.println(dollar+" Dollar");
    }
}
