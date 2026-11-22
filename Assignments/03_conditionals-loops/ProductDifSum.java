import java.util.Scanner;

public class ProductDifSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer");
        int val = in.nextInt();
        int sum = 0;
        int product = 1;
        while(val != 0){
            int rem = val%10;
            sum += rem;
            product *= rem;
            val = val/10;
        }
        System.out.println("Sum of Integers: "+sum);
        System.out.println("Product of Integers: "+product);
        if(product>sum){
            System.out.println("Difference b/w product and sum is "+(product-sum));
        }else{
            System.out.println("Difference b/w product and sum is "+(sum-product));
        }

    }
}
