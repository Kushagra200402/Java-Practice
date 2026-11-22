public class NumbersExampleRecursion {
    public static void main(String[] args) {
//        Write a function that takes in a number and prints it
//        print first 5 numbers: 1 2 3 4 5
        print(1);
    }

    static void print(int i) {
//        Base Condition: Condition where recursion will stop making new calls
        if (i > 5) return;

        System.out.print(i+" ");

//        This is the last function call
//        This is called Tail Recursion
        print(i+1);  //recursive call
//         When you have last statement in the function call then this is called "Tail Recursion".

//        If you are calling a function again and again, you can treat it as a separate call in stack.
//        If there is no base condition, function will keep calling itself again and again
//        stack will be filled again and again and this will cause "Stack Overflow Error"
    }
//    RECURSION : Function that calls itself til the base condition is met.
//    Why Recursion: It helps in solving bigger/complex problems in a simpler way.
//    You can convert recursion solution into iteration and vice-versa.
//    Space complexity is not constant because of the recursive calls.
//    It helps us in breaking down bigger problems into smaller problems.
}

//While the function call is not finished executing, it will stored in stack

