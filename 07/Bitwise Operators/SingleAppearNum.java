import java.util.Scanner;

public class SingleAppearNum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("No. of inputs in array");
        int n = ip.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = ip.nextInt();
        }
        System.out.println("Single appeared number is: "+findnum(arr));
    }

    static int findnum(int[] num) {
        int unique = 0;
        for(int i: num){
            unique = unique ^ i;
        }
        return unique;
    }
}
