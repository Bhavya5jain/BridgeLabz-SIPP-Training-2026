package gcr_codebase.Control_Flow.LEVEL2;

import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                System.out.println("Factors of " + number + " (excluding itself):");
                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        System.out.println(i);
                    }
                }
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}