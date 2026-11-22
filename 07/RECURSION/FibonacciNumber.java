public class FibonacciNumber {
    public static void main(String[] args) {
//        System.out.println(fibo(10));
        int n = 5;
//        for (int i = 0; i < n; i++){
//            System.out.println(fibo(n));
//        }
        fibo(n);
//        for(int i = 0; i < n; i++){
//            System.out.println(fiboFormula(i));
//        }
    }

//    Find fibonacci number through recursion
    static int fibo(int n) {
        if(n<2){
            System.out.println(n);
            return n;  //Base Condition
        }
        System.out.println(fibo(n-1)+fibo(n-2));
        return fibo(n-1)+fibo(n-2); // This is not Tail Recursion
//        Here the statement is not returning the function, it is returning addition of two functions
    }

//    Find fibonacci number using formula
    static int fiboFormula(int n){
//        just for demo, use long instead
        return (int) ((Math.pow((1 + Math.sqrt(5))/2, n) - Math.pow((1 - Math.sqrt(5))/2, n))/Math.sqrt(5));
//        Math.pow((1 - Math.sqrt(5))/2, n) is less dominating term, it's value will affect the final value of fibo(n) for small n but not for large n;
    }
}
