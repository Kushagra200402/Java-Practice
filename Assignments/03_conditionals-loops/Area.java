import java.util.Scanner;

public class Area {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Tell me which shape's area you want?");
        String shape = in.next();

        switch (shape){
            case "Circle" -> AreaOfCircle();
            case "Triangle" -> {
                System.out.println("Which Triangle? Normal/Isosceles/Equilateral");
                String triangle = in.next();
                switch (triangle){
                    case "Normal", "Isosceles" -> AreaOfTriangle();
                    case "Equilateral" -> AreaOfEquilateralTriangle();
                    default -> System.out.println("Wrong Input!");
                }
            }
            case "Rectangle" -> AreaOfRectangle();
            case "Parallelogram" -> AreaOfParallelogram();
            case "Rhombus" -> AreaOfRhombus();
            default -> System.out.println("Wrong Input!");
        }
    }

    private static void AreaOfRhombus() {
        System.out.println("What do you have Diagonals or Base&Height");
        String attribute = in.next();
        switch (attribute){
            case "Diagonals"-> {
                System.out.println("Enter the value of diagonals");
                int d1 = in.nextInt();
                int d2 = in.nextInt();
                float area = (float) d1*d2/2;
                System.out.println("Area of Rhombus is "+area);
            }
            case "Base&Height"->{
                System.out.println("Enter base and height of Rhombus");
                int base = in.nextInt();
                int height = in.nextInt();
                int area = (base * height);
                System.out.println("Area of Rhombus is "+area);
            }
            default -> System.out.println("Wrong Input!");
        }
    }

    private static void AreaOfParallelogram() {
        System.out.println("Enter base and height of Parallelogram");
        int base = in.nextInt();
        int height = in.nextInt();
        int area = (base * height);
        System.out.println("Area of Parallelogram is "+area);
    }

    private static void AreaOfEquilateralTriangle() {
        System.out.println("Enter the side of the triangle");
        int side = in.nextInt();
        float area = (float) (Math.sqrt(3)/4)*side*side;
        System.out.println("Area of Equilateral triangle is "+area);
    }

    static void AreaOfRectangle() {
        System.out.println("Enter Base and height");
        int base = in.nextInt();
        int height = in.nextInt();
        int area = (base * height);
        System.out.println("Area of Rectangle is "+area);
    }

    private static void AreaOfTriangle() {
        System.out.println("Enter base and height");
        int base = in.nextInt();
        int height = in.nextInt();
        float area = (float) 1/2 * (base * height);
        System.out.println("Area of triangle is "+area);
    }

    private static void AreaOfCircle() {
        System.out.println("Enter radius of the circle");
        int radius = in.nextInt();
        float area = (float) (3.14)*radius*radius;
        System.out.println("Area of circle is "+area);
    }
}
