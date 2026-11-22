import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the EmpId and department");
        int EmpId = in.nextInt();
        String department = in.next();

        switch (EmpId) {
            case 1 -> System.out.println("Rahul Rai");
            case 2 -> System.out.println("Abhijeet Joshi");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Entered");
                }
            }
            default -> System.out.println("Enter correct EmpId");
        }
    }
}
