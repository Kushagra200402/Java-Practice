import java.util.Scanner;

public class ImprovedArmstrongBetweenTwoNum {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter two numbers in the order you want to search for Armstrong numbers:");
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println("Armstrong numbers between " + a + " and " + b + " are:");
            for (int num = a; num <= b; num++) {
                if (isArmstrong(num)) {
                    System.out.println(num);
                }
            }
        }

        public static boolean isArmstrong(int num) {
            int originalNum = num;
            int numberOfDigits = countDigits(num);
            int sum = 0;

            while (num != 0) {
                int rem = num % 10;
                sum += Math.pow(rem, numberOfDigits);
                num /= 10;
            }

            return sum == originalNum;
        }

        public static int countDigits(int num) {
            return (int) Math.log10(num) + 1;
        }
    }
