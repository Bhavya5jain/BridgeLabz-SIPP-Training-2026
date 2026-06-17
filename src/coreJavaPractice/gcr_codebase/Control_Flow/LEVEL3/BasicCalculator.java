package coreJavaPractice.gcr_codebase.Control_Flow.LEVEL3;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double first = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double second = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String op = scanner.next();

            double result = 0;
            boolean valid = true;

            switch (op) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if (second == 0) {
                        System.out.println("Error: System cannot divide by zero.");
                        valid = false;
                    } else {
                        result = first / second;
                    }
                    break;
                default:
                    System.out.println("Invalid Operator.");
                    valid = false;
                    break;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }

        } catch (Exception e) {
            System.out.println("Error processing inputs. Recheck numerical entries.");
        }
        scanner.close();
    }
}