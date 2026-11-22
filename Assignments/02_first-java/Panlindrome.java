import java.util.Scanner;

public class Panlindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String text = in.next();
        text = text.toLowerCase();

        String rev = "";
        for(int i= text.length()-1; i>=0; i--){
            rev = rev + text.charAt(i);
        }
        if(text.equals(rev)){
            System.out.println("The given string is Palindrome");
        }else{
            System.out.println("The given string is not a Palindrome");
        }
    }
}
