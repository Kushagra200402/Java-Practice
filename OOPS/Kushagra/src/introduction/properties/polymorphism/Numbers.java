package introduction.properties.polymorphism;

//Example of static/compile time polymorphism
public class Numbers {
    double sum(double a, int b){
        return a+b;
    }
//    int sum(int a, int b){
//        return a+b;
//    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    void sum(String a, int b){
        System.out.println("Sum = a+b");
    }

    void sum(int a, String b){
        System.out.println("Sum <> a+b");
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(3, 4); //Even if you pass integer, java will cast it to double for a. Vice-versa doesn't work (double'size > int'size)
        obj.sum(5, 6, 3);
        obj.sum("tree", 3);
        obj.sum(4, "trie");

    }
}
