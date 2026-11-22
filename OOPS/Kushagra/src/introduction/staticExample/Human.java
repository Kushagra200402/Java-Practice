package introduction.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; //static is used with those properties which are common to all objects.
    //"When a member is declared static, it can be accessed before any of the object of the class being created and w/o referencing
    // to that object."

    static void message(){
        System.out.println("Hello people!");
//        System.out.println(this.age); // Can't use this over here, age is non-static
    }
    public Human(int age, String name, int sal, boolean married){
        this.age = age;
        this.name = name;
        this.salary = sal;
        this.married = married;
        Human.population += 1; //You can put this.population also. But in that case it will check whether this method has population
                                // property or not, the ans will be no then it will check in class so since in class this is static
                                // variable it will add this too.
    }
}
