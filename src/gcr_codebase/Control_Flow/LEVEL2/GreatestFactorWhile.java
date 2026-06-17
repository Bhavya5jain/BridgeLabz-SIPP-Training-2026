package gcr_codebase.Control_Flow.LEVEL2;

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int greatestFactor = 1;
            int counter = number - 1;

            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor beside itself is: " + greatestFactor);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}