public class Performance {
    public static void main(String[] args) {
        String series = "";

        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
//            System.out.println(ch);
            series += ch;   // Character is converted into string while adding
//            ch +=  series;
        }

        System.out.println(series);
//        If any of the type is string, all other data types which are added to string will converted into string while printing

//        This is the worst way to add characters because every time we are adding a new character to the string, new object is created
//        And all other previous objects have no reference so these much memory is going to be wasted.
//        As strings are immutable in java, we can not modify the original string
//        Even though the for loop is running n times but when we are adding those strings they are running once, twice, thrice and so on.
//        So total number of iterations  will be = 1+2+3+.....+n = n(n+1)/2 = O(n^2)

//        So is there any object/data type in java that actually add characters to the string rather than creating new object?
//        - Yes, it is called StringBuilder
//        In StringBuilder, only one object is made and changes are done in that object only
//        The reference is also the same and it is not changed
    }
}
