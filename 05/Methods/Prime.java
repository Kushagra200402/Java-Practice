import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println(isPrime(n));

//        Printing all the 3 digit Armstrong Numbers
        System.out.println("All 3 digit Armstrong Numbers");
        for (int i = 100; i<1000; i++){
            if(IsArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        int c = 2;
        while(c*c <= num){
            if(num%c == 0){
                return false;
            }
            c++;
        }
        return c * c > num;   // If c*c > num then it will return true otherwise false
    }

//    Print all the 3 digit Armstrong Numbers
    static boolean IsArmstrong(int n){
        int org = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem*rem*rem;
            n = n/10;
        }
        return sum==org;
    }
}
