import java.util.Scanner;

import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter a and b");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("a = "+a+" and b = "+b+" before swapping");
        swap(a, b);
//        int temp = a;
//        a = b;
//        b = temp;
        System.out.println("a = "+a+" and b = "+b+" after swapping");
    }

    static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;

//        This change will be valid in this function scope only
    }
//    Values won't be swapped because copies of values are passed
//    In java there is no pass by value only pass by reference
}
