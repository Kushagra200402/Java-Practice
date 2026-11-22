import java.lang.String;
import java.util.Arrays;

public class FixString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
    static String restoreString(String s, int[] indices) {
        char[] str = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            str[indices[i]] = s.charAt(i);
        }
        s = String.copyValueOf(str);
        return s;
    }
}
