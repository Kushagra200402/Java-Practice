public class Factorial {
    public static void main(String[] Args){
        System.out.println(calcFact(5));
        System.out.println(calcSum(5));
    }

    static int calcFact(int n){
        if (n<=1){
            return 1;
        }
        return n * calcFact(n-1);
    }

    static int calcSum(int n){
        if (n<=1){
            return 1;
        }
        return n + calcSum(n-1);
    }
}
