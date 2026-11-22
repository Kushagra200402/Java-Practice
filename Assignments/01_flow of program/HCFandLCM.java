import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int hcf = 1, lcm;

        if((n1 < 1) || (n2 < 1)){
            System.out.println("Invalid Input!");
        }else {
            for (int i = 1; i <= n1 && i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    hcf = i;
                }
            }
            lcm = (n1 * n2)/hcf;
            System.out.println("HCF = "+ hcf +" & LCM = "+ lcm);
        }

    }
}
