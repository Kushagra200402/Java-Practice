import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class MaximumWealth {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of customers");
//        int customer = in.nextInt();
//        int num_acc = in.nextInt();
//        int[][] accounts = new int[customer][num_acc];
//        for(int i = 0; i<customer; i++){
//            for(int j = 0; j<num_acc; j++){
//                accounts[i][j] = in.nextInt();
//            }
//        }

        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        System.out.println(maxWealth(accounts));

    }

    static int maxWealth(int [][] arr){
        int max_wealth = Integer.MIN_VALUE;
        for (int[] cust : arr) {
            int wealth = 0;
            for (int acc : cust) {
                wealth += acc;
            }
            if(wealth>max_wealth)
                max_wealth = wealth;
        }
        return max_wealth;
    }
}
