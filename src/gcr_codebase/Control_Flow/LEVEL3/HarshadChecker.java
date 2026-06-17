package gcr_codebase.Control_Flow.LEVEL3;

import java.util.Scanner;

public class HarshadChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Please provide a value greater than 0.");
            } else {
                int sum = 0;
                int temp = number;

                while (temp != 0) {
                    sum += temp % 10;
                    temp = temp / 10;
                }

                if (number % sum == 0) {
                    System.out.println(number + " is a Harshad Number.");
                } else {
                    System.out.println(number + " is Not a Harshad Number.");
                }
            }
        } else {
            System.out.println("Input is not a valid integer.");
        }
        scanner.close();
    }
}