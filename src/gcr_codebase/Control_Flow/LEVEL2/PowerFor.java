package gcr_codebase.Control_Flow.LEVEL2;

import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the base number: ");
            int number = scanner.nextInt();
            System.out.print("Enter the power exponent: ");
            int power = scanner.nextInt();

            if (number < 0 || power < 0) {
                System.out.println("Please enter positive integers.");
            } else {
                long result = 1;
                for (int i = 1; i <= power; i++) {
                    result *= number;
                }
                System.out.println("Result: " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers.");
        }
        scanner.close();
    }
}