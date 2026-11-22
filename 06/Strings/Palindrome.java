import java.lang.String;
public class Palindrome {
    public static void main(String[] args) {
//        String string = null;
        String string = "abcdcba";
        System.out.println(isPalindrome(string));
    }
    static boolean isPalindrome(String str){
        //first check
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0; i<str.length()/2; i++){
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
