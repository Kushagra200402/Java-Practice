package introduction.access;

public class A {
//    private int num; // This can be accessed anywhere inside the class
    protected int num;  // protected is used when we are talking about inheritance
    public String name;
    int[] arr;


    // Getter for variable num. To access private variable outside the class we are using this public method.
    public int getNum() {
        return num;
    }

    // Setter for num. Getter gets the value and setter sets the value
    public void setNum(int num) {
        this.num = num;
    }

    public A(int n, String name){
        this.num = n;
        this.name = name;
        this.arr = new int[n];
    }
}

// private: Only in this class
// public: Anywhere
// default (when you are not defining the access modifier): Can't be accessed outside the package directly.
