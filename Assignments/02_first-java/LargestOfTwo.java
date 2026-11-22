import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int max = n1;
        if(n1<n2){
            max = n2;
        }
        System.out.println("Maximum value = " + max);
    }
}
