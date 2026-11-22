import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum3(23, 45);
        System.out.println(ans);
    }

//    pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
//    return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int ans = n1 + n2;
        return ans;
    }
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the two numbers");
//        int n1 = in.nextInt();
//        int n2 = in.nextInt();
//        int ans = n1 + n2;
//        System.out.println("Sum = "+ans);
//    }
}
