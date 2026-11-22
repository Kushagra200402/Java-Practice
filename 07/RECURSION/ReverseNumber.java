import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        int a = reverse(12001);
        System.out.println(a);
        rev1(12001);
        System.out.println(sum);
        System.out.println(rev2(12001));
    }

    static int reverse(int num){
        if(num < 10) {
            return num;
        }
        int count = (int) Math.floor(Math.log10(num) + 1);
        int rev =  num%10 * (int) Math.pow(10, count-1);
        return rev + reverse(num/10);
    }

    static int sum = 0;
    static void rev1(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    static int rev2(int n){
//        Sometimes you might need some additional variables in the argument
//        In that case, make another function
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n/10, digits - 1);
    }


}

