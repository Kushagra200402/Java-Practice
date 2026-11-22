import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers you want to add and enter 0 to exit");
        int sum = 0;
        int num;
        do {
            num = in.nextInt();
            sum += num;
        } while (num != 0);
        System.out.print("Sum of All: " + sum);
    }
}
