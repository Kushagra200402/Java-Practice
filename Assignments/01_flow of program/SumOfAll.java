import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        String choice = "";

        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number or x to quit");

        while(!choice.equals("x")){
            choice = input.next();

            if(!choice.equals("x")){
                int number = Integer.parseInt(choice);
                sum = sum+number;
            }
        }

        System.out.println("Sum is: "+sum);

    }
}





//My approach
//        Scanner in = new Scanner(System.in);
//        int sum = 0;
//        char choice;
//        choice = in.next().trim().charAt(0);
//        while (choice != 'x'){
//            int num = in.nextInt();
//            sum += num;
//        }
//        System.out.println("Sum = " + sum);