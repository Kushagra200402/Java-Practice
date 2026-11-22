import java.util.Scanner;

public class LargestOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values");
        int num;
        int max = 0;
        do{
            num = in.nextInt();
            if(num>max){
                max = num;
            }
        }while(num!=0);
        System.out.println("Largest of All numbers you've entered is: "+max);
    }
}
