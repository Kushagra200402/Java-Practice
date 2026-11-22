import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//        System.out.print("Hello World!");  //Will not add new line
//        System.out.println("My name is Kushagra");  //Will add new line

        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt());   //Will print the input integer value
//        System.out.println(input.next());      //Will print the first string till space of input
        System.out.println(input.nextLine());    //Will print the whole string
    }
}
