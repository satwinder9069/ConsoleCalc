package task1_calculator;

import java.util.Scanner;

public class Main {
    public static void printBinaryResult(double num1, double num2, double result, String operator) {
        System.out.printf("%.2f %s %.2f = %.2f\n", num1, operator, num2, result);
    }

    public static void printUnaryResult(double num1, double result, String operation) {
        System.out.printf("%s of %.2f is %.2f\n",operation, num1, result);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        char choice;
        do {
            System.out.println("Calculator");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Square Root");
            System.out.println("7. Power (a ^ b)");
            System.out.println("8. Exit");
            System.out.print("Choose an option (1-8): ");

            int option = input.nextInt();

            double num1, num2, result = 0;


            if(option == 8) {
                System.out.println("Exiting Calculator, Bye!");
                break;
            }

            if(option == 6){
                System.out.print("Enter a number: ");
                num1 = input.nextDouble();
                result = calc.squareRoot(num1);
                printUnaryResult(num1, result, "Square root");
            } else {
                System.out.print("Enter first number: ");
                num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                num2 = input.nextDouble();

                switch (option) {
                    case 1:
                        result = calc.add(num1, num2);
                        printBinaryResult(num1, num2, result, "+");
                        break;

                    case 2:
                        result = calc.subtract(num1, num2);
                        printBinaryResult(num1, num2, result, "-");
                        break;
                    case 3:
                        result = calc.multiply(num1, num2);
                        printBinaryResult(num1, num2, result, "*");
                        break;
                    case 4:
                        result = calc.divide(num1, num2);
                        printBinaryResult(num1, num2, result, "/");
                        break;
                    case 5:
                        result = calc.modulus(num1, num2);
                        printBinaryResult(num1, num2, result, "%");
                        break;
                    case 7:
                        result = calc.power(num1, num2);
                        printBinaryResult(num1, num2, result, "^");
                        break;
                    default:
                        System.out.println("Invalid choice!");

                }
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice  == 'Y');

        input.close();
    }
}
