package introduction;

import static introduction.a.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("I will do it for sure");
        message(); // Only public methods can be accessed from one package to another
    }
}
