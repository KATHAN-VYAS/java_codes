import java.util.*;

public class math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a ");
        double a = sc.nextDouble();
        System.out.println("enter value of b ");
        double b = sc.nextDouble();
        
        // Consume the newline character left in the input stream
        sc.nextLine();
        
        System.out.println("enter method name ");
        String method = sc.nextLine();

        switch(method) {
            case "sum":
                System.out.println("sum of given numbers is " + (a + b));
                break;
            case "subtract":
                System.out.println("subtraction of numbers is "+(a-b));
                break;
            case"multiply":
                System.out.println("multiplication of numbers is "+(a*b));
                break;
            case"divide":
                System.out.println("division is "+(a/b));           
            default:
                System.out.println("Invalid method name");
                break;
        }
    }
}
