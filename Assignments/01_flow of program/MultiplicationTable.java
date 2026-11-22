import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the desired number");
        int num = in.nextInt();
        System.out.println("Till which number you want the multiplication table?");
        int ans = in.nextInt();
        int count = 1;
        while(count <= ans){
            System.out.println(num +" X "+ count +" = "+ (num*count));
            count++;
        }
    }
}
