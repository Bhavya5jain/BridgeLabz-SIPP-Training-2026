package coreJavaPractice.gcr_codebase.Control_Flow.LEVEL2;

import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the base number: ");
            int number = scanner.nextInt();
            System.out.print("Enter the power exponent: ");
            int power = scanner.nextInt();

            long result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers.");
        }
        scanner.close();
    }
}