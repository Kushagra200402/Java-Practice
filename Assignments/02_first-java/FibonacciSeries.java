import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        int prev = 0;
        int next = 1;
        System.out.print(prev+" ");
        for(int i=2; i<=n; i++){
            int temp = next;
            System.out.print(next+" ");
            next = next + prev;
            prev = temp;
        }
    }
}
