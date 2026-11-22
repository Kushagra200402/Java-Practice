import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();

        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem==3){
                count++;
            }
            n /= 10;
        }

        System.out.println("No. of 3's in number are "+count);
    }
}
