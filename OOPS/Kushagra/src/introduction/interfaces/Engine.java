package introduction.interfaces;

public interface Engine {

    int PRICE = 230000; // by default static and final, no need to mention it.

    void start(); // by default public
    void stop();
    void acc();
}
