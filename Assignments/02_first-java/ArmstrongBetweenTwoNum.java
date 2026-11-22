import java.util.Scanner;

import static java.lang.Math.pow;

/*Armstrong number is the number in any given number base, which forms the total of the same number,
when each of its digits is raised to the power of the number of digits in the number.*/
public class ArmstrongBetweenTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers in order in which you want to search armstrong numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Armstrong numbers are");
        for(int i=a; i<=b; i++){
            int org = i;
            int count = 0;
            while(i!=0) {
                i = i / 10;
                ++count;
            }
            i = org;
            int sum = 0;
            while(i != 0) {
                int rem = i % 10;
                sum += pow(rem, count);
                i = i / 10;
            }
            if(sum == org){
                System.out.println(org);
            }
            i = org;
        }
    }
}
