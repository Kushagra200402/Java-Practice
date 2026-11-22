import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        program to print first n numbers

//        for loop
//        for(int num = 1; num <= n; num++){
//            System.out.print(num+" ");
//        }

//        while loop
//        int num = 1;
//        while(num <= n){
//            System.out.println(num);
//            num++;
//        }

//        do-while loop
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num<=n);
    }
}
