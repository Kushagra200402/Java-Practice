import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Kushagra";
        char ch = 'a';
//        System.out.println(search(name, ch));
        System.out.println(search2(name, ch));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str, char target){
        if(str.length()==0)
            return false;
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i))
                return true;
        }
        return false;
    }

//    Using for each loop
    static boolean search2(String str, char target){
        if(str.length()==0)
            return false;
        for (char ch: str.toCharArray()) {
            if(ch == target)
                return true;
        }
        return false;
    }
}
