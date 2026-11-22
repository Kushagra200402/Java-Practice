public class NumbersExample {
    public static void main(String[] args) {
//        Write a function that takes in a number and prints it
//        print first 5 numbers: 1 2 3 4 5
        print1(1);
    }

    static void print1(int i) {
        System.out.print(i+" ");
        print2(2);
    }

    static void print2(int i) {
        System.out.print(i+" ");
        print3(3);
    }

    static void print3(int i) {
        System.out.print(i+" ");
        print4(4);
    }

    static void print4(int i) {
        System.out.print(i+" ");
        print5(5);
    }

    static void print5(int i) {
        System.out.print(i+" ");
    }
}

//While the function call is not finished executing, it will stored in stack.
// Once the function finishes executing, it will be removed from the stack and the flow of the program will be
// restored to where the function was called.
