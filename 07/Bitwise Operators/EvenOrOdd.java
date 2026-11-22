import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(IsEven(num))
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }

    public static boolean IsEven(int n) {
//        if((n & 1) == 1)
//            return false;
//
//        return true;
        return (n & 1) == 0;
    }
}

// 37 = 100101
//& 1 = 000001
//------------
//      000001 = 1 hence 37 is odd else even

// 10 = 1010
//& 1 = 0001
//----------
//      0000 = 0 hence 10 is even