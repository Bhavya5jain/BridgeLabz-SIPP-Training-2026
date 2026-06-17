package gcr_codebase.Control_Flow.LEVEL2;

import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer below 100: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number <= 0 || number >= 100) {
                System.out.println("The number must be a positive integer less than 100.");
            } else {
                System.out.println("Numbers below 100 perfectly divisible by " + number + ":");
                int counter = 99;
                while (counter > 1) {
                    if (counter % number == 0) {
                        System.out.println(counter);
                    }
                    counter--;
                }
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}