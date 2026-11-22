public class NumOfZeros {
    public static void main(String[] Args){
        int num = 10909;
        System.out.println(countZeros(num));
    }

    private static int countZeros(int num) {
        int count = 0;
        if (num==0){
            return 1;
        }
        return countdigits(num, count);
    }

    // Special case: How to pass value to above calls
    private static int countdigits(int num, int count) {
        if (num == 0){
            return count;
        }
        if (num%10 == 0){
            return countdigits(num/10, count+1);
        }else{
            return countdigits(num/10, count);
        }
    }
}
