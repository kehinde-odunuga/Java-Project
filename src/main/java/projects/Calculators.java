package projects;

import java.util.Scanner;

public class Calculators {
    public static void main(String[] args) {
        Calculators calc = new Calculators();
        Scanner input = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("num1: ");
                double x = input.nextDouble();
                System.out.println("operation (+, -, *, /): ");
                char operand = input.next().charAt(0);
                System.out.println("num2: ");
                double y = input.nextDouble();


                switch (operand) {
                    case '+':
                        System.out.println("answer: "+calc.add(x,y));
                        break;
                    case '-':
                        System.out.println("answer: "+calc.subtract(x,y));
                        break;
                    case '*':
                        System.out.println("answer: "+calc.multiply(x,y));
                        break;
                    case '/':
                        System.out.println("answer: "+calc.divide(x,y));
                        break;
                    default:
                        System.out.println("Invalid operation");
                }
            } catch (Exception e) {
                System.out.println("An error occured: "+e.getMessage());
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            input.nextLine();  // consume the newline character
            String again = input.nextLine();
            if (!again.equalsIgnoreCase("yes")) {
                break;
            }
        }

        input.close();
    }
    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }
}
