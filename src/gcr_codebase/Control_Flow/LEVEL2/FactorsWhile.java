package gcr_codebase.Control_Flow.LEVEL2;

import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                System.out.println("Factors of " + number + " (excluding itself):");
                int counter = 1;
                while (counter < number) {
                    if (number % counter == 0) {
                        System.out.println(counter);
                    }
                    counter++;
                }
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}