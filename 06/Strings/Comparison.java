public class Comparison {
    public static void main(String[] args) {
        //Command line arguments (Which we write in terminal to run the java file) are stored in args string array
        String a = "Nitesh";
        String b = "Nitesh";
//        Here both variables are in stack pointing to the same object "Nitesh" in String pool in Heap memory
//        ==
        System.out.println(a == b); // Hence it will give true

        String c = a; // Now c is also pointing to the same object
        System.out.println(c == a); //It will also give true

        String name1 = new String("Nitesh");
        String name2 = new String("Nitesh");
//        Both of these objects are created outside of string pool in heap
//        Here both varibles(name1 & name2) are pointing to different objects even if there values are same
        System.out.println(name1 == name2); //Hence it will give false (in case of ==)

//        If you want to check whether these values(in different objects) are same or not, you can use ".equals()" method
        System.out.println(name1.equals(name2)); //This will give true

        System.out.println(name1.charAt(0)); //character at 0th index
    }
}
