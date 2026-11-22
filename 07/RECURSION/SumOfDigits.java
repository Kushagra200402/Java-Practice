public class SumOfDigits {
    public static void main(String[] Args){
        System.out.println(calSum(505));
        System.out.println(calProd(505));
    }
    static int calSum(int num){
        if(num < 10){
            return num;
        }
        return calSum(num/10) + num%10;
    }

    static int calProd(int num){
        if(num < 10){
            return num;
        }
        return calProd(num/10) * (num%10);
    }
}
