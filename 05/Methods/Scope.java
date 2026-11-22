public class Scope {
    public static void main(String[] args) {
        int a = 10;  // Initializing 'a'
        int b = 78;
//       "Function Scope": The scope of these variables will be inside this function only.
//        System.out.println(marks);  //Error
        {
//            "Block Scope": values initialized in this block will remain in block
//            int a = 34; // Already initialized outside the block in the same method, hence you cannot initialize it again.
            a = 45;  // Updating 'a': reassign the original reference variable to some other value
            System.out.println(a);
            int c = 56;
        }
        int c = 88; //No error: Value which is initialized inside the block can be reinitialized outside the block but can not be updated.
        System.out.println(a);
//        System.out.println(c); // cannot use outside the block


//        Scoping in for loops
        for (int i=0; i<5; i++){
            System.out.println(i);
            int num = 90;
//            int a = 10; // Error
        }
//        System.out.println(i); // Error: Java cannot find symbol(variable i).
    }
    static void Random(int marks){
//        System.out.println(a); // It will give an error because a is not known to this function.
        marks = 89;
        System.out.println(marks);
    }
}
