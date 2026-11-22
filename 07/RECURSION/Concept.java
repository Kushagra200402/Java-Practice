public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if (n == 0){
            return;
        }

        System.out.println(n);
//        fun(n--); //It will pass n then subtract. That's why it will always pass 5 causing stack overflow.
        fun(--n); //It will subtract 1 then pass n.
    }
}
