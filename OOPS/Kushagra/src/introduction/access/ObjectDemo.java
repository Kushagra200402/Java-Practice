package introduction.access;

public class ObjectDemo {

    int num;
    float gpa;
    public ObjectDemo(int n, float gpa){
        this.num = n;
        this.gpa = gpa;
    }

    // toString gives the string representation of data
    @Override
    public String toString() {
        return super.toString();
    }

    // finalize gets called when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // we will go in details of how to create it in hashmap lecture
    // It gives numeric representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
//        return num; // will show value of num as an output
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public ObjectDemo() {
        super();
    }

    public static void main(String[] args){
        ObjectDemo obj1 = new ObjectDemo(45, 23.4f);
        ObjectDemo obj2 = new ObjectDemo(45, 34.24f);
        ObjectDemo obj3 = obj1;
        System.out.println(obj1.hashCode()); // Hashcode means "a unique representation of an object via a number".
        System.out.println(obj2.hashCode()); // will print a different number even if the value of n is same (since it is representing the object)
        System.out.println(obj3.hashCode()); // It will return the same number as obj1 since both are same.

        if(obj1 == obj2){ // '==' checks where both variables are pointing to the same object or not.
            System.out.println("obj1 is equal to obj2");
        }

        if(obj1.equals(obj2)){ // '.equals()' is actually checking the content of the objects
            System.out.println("obj1 is equal to obj2, ok!");

        }

        if(obj1 == obj3){
            System.out.println("obj1 is equal to obj3");
        }

        if(obj1.equals(obj3)){
            System.out.println("obj1 is equal to obj3, ok!");

        }

        // Note: Hashcode doesn't represent the address of an object. It is a random integer value formed via using some algorithm.
        // hashcode just gives us a random number so that we can identify whether it is a same or different object.

        System.out.println(obj1.getClass()); // If you want to get the metadata about the classes.
        //Whenever you get this getClass information,it will actually be stored in heap
        //getClass is final so you can't override it
    }
}
