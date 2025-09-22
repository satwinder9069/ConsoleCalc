package task1_calculator;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if(b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0;
        }
        return a / b;
    }
    public double modulus(double a, double b) {
        return a % b;
    }

    public double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Negative number cannot have real square root!");
            return 0;
        }
        return Math.sqrt(a);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }


}
