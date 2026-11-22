import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        if(num%2==0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }
}
