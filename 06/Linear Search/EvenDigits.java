public class EvenDigits {
//    Find numbers with even number of digits
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896, 128413};
        System.out.println("The total no. of numbers having even digits in the array: "+findNumbers(arr));
//        System.out.println("The total no. of numbers having even digits: "+findNumUsingString(arr));
        System.out.println(digits(18));
        System.out.println(digits2(0));
    }

    static int findNumbers(int[] nums){
        int nums_count = 0;
        for (int num : nums) {
            if (even(num))
                nums_count++;
        }
        return nums_count;
    }

//    Function to check whether the number contains even digits or not
    static boolean even(int num){
        /*
        int digit_count = digits(num);
            if(digit_count%2==0)
                return true;
        return false;
         */
        return digits(num)%2==0;
    }

//    Function to count the number of digits in a number
    static int digits(int num){
        if(num<0)
            num *= -1;
        if(num==0)
            return 1;
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }

    //   Another way to count the number of digits in a number
    static int digits2(int num){
        if(num<0)
            num *= -1;
        if(num==0)
            return 1;
        return (int)(Math.log10(num)) + 1;
    }


//    Second method to do this question
    static int findNumUsingString(int[] nums){
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            String num = Integer.toString(nums[i]);
            if(num.length()%2==0)
                count++;
        }
        return count;
    }
}

/* Two ways to do this
1. Count the number of digits
2. Convert the number into the string (Using Integer.toString Method) and take the length
 */