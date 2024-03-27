import java.util.*;

class MathFunctions {

    static double asine(double a) {
        double r = Math.asin(a);
        return r;
    }

    static double acos(double a) {
        double r = Math.acos(a);
        return r;
    }

    static double atan(double a) {
        double r = Math.atan(a);
        return r;
    }

    static double sine(double a) {
        double r = Math.sin(a);
        return r;
    }

    static double cos(double a) {
        double r = Math.cos(a);
        return r;
    }

    static double tan(double a) {
        double r = Math.tan(a);
        return r;
    }

    static double exp(double a) {
        double r = Math.exp(a);
        return r;
    }

    static double log(double a) {
        double r = Math.log(a);
        return r;
    }
}

public class sci_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type method name (asine/acos/atan/sine/cos/tan/exp/log):");
        String methodName = sc.nextLine();
        System.out.println("Enter a value:");
        double value = sc.nextDouble();
        double result = 0;
        
        switch (methodName) {
            case "asine":
                result = MathFunctions.asine(value);
                break;
            case "acos":
                result = MathFunctions.acos(value);
                break;
            case "atan":
                result = MathFunctions.atan(value);
                break;
            case "sine":
                result = MathFunctions.sine(value);
                break;
            case "cos":
                result = MathFunctions.cos(value);
                break;
            case "tan":
                result = MathFunctions.tan(value);
                break;
            case "exp":
                result = MathFunctions.exp(value);
                break;
            case "log":
                result = MathFunctions.log(value);
                break;
            default:
                System.out.println("Invalid method name.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
