package introduction.properties.polymorphism;

public class ObjectPrint {
    int num;
    ObjectPrint(int n){
        this.num = n;
    }

    @Override //overriding toString method of object class
    public String toString(){
//        return Integer.toString(this.num);
        return "ObjectPrint{"+"num = "+num+'}';
    }
    // by default in java, every class is extending object class

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj);
    }
}
