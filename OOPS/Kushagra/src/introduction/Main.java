package introduction;
import java.awt.dnd.DragGestureEvent;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //    Store 5 roll no.s
        int[] roll_no = new int[5];

//    Store 5 names
//        String[] name = new String[5];

//    Store data of 5 students : {roll_no, name, marks}
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];

        Student students = new Student();
        System.out.println(students.name);

        students.changeName("Tarzen");
        students.greeting();

//        Just declaring
        Student kush1; // kush is reference variable  -- objects created at compile time
        kush1 = new Student(); // memory allocated at run time
//        System.out.println(kush);

        Student kush = new Student(23, "Ramya Puppla", 99.9f);
        System.out.println(kush.name);
        System.out.println(kush.rno);
        System.out.println(kush.marks);

        kush.greeting();

        Student siri = new Student(kush);

        System.out.println(siri.name);

        Student random = new Student();
        System.out.println(random.name);

        Student one = new Student();
        Student two = one;

        one.name = "one";
        System.out.println(two.name); //Since both variables in stack are pointing to the same object in heap memory
        // That's why change in value of one object leads to change in another.
    }
}
// A class is a named group of properties and functions
// A class is a template of an object and an object is an instance of a class
/*
3 essential properties of the object
- State of the object: It's value from its data type
- Identity of the object: whether one object is different from other (where the value is stored in memory)
- Behaviour of the object: Effect of the data type operations (functions/methods)
*/
//create a class
//for every single student
class Student{
    int rno;           // These are instance variables
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello! my name is "+ name);
    }

    void changeName(String newName){
        name = newName;
    }

//    we need a way to add the values of above properties object by object
//    we need one word to access every object
//    Student() {
//        this.rno = 12;
//        this.name = "kunal";
//        this.marks = 34.5F;
//    }

    Student(){
        // this is how you call a constructor from another constructor
        // internally it is Student(24, "Hulk", 47.5f);
        this (24, "Hulk", 47.5f);
    }
    Student (int roll, String name, float marks){
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}

// In java primitives are stored in stack memory while objects are stored in heap memory.
