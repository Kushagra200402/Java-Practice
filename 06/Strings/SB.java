public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<26; i++){
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        if(builder.charAt(0) == 'a'){
            System.out.println('c');
        }
        builder.insert(1, 'c');
        System.out.println(builder);
        builder.append('m');
//        System.out.println(builder.toString()); //You can convert it to string also

        // StringBuilder is mutable. We can change/modify it.

        // You can perform several function of StringBuilder class
//        builder.deleteCharAt(1);
//        builder.reverse();
//        builder.append(5);
//        builder.delete(0, 23);
//        System.out.println(builder.indexOf("z"));
//        System.out.println(builder.lastIndexOf("m"));
        System.out.println(builder.length());

        System.out.println(builder);
    }
}
