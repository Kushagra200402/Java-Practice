package introduction.properties.inheritance;

public class Box {
    private double l = 9; //making a variable as private is called data hiding.
    double h;
    double w;

//    double weight;

    static void greetings(){
        System.out.println("Hey I am in Box class, Greetings!");
    }
    Box(){
        super(); //Object class: Every single class you create has Object as its superclass
        this.l = -1;
        this.h = -1;
        this.w = -1;
//        this.weight = 0;
    }

    //cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    //cuboid
    Box(double length, double height, double width){
        this.l = length;
        this.w = width;
        this.h = height;
    }

    //copy constructor
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }

    //getter
    public double getL() {
        return l;
    }
}
