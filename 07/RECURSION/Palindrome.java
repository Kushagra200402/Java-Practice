public class Palindrome {

    static int reverse(int num){
        if(num < 10) {
            return num;
        }
        int count = (int) Math.floor(Math.log10(num) + 1);
        int rev =  num%10 * (int) Math.pow(10, count-1);
        return rev + reverse(num/10);
    }
    static boolean is_palindrome(int n){
        return n == reverse(n);
    }

    public static void main(String[] args) {
        System.out.println(is_palindrome(12421));
    }
}
