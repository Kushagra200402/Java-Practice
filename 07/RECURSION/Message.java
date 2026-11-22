public class Message {
    public static void main(String[] args) {
//        write a function that prints hello world
        message();
    }

    static void message(){ //Debug this code from here to get understanding of function call
        System.out.println("Hello World!");
        message1();
    }
//    To print 5 times "Hello World"
    static void message1(){
        System.out.println("Hello World!");
        message2();
    }
    static void message2(){
        System.out.println("Hello World!");
        message3();
    }
    static void message3(){
        System.out.println("Hello World!");
        message4();
    }
    static void message4(){
        System.out.println("Hello World!");
    }
}

