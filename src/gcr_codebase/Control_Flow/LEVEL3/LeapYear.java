package gcr_codebase.Control_Flow.LEVEL3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");

        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();

            if (year < 1582) {
                System.out.println("The program only works for years starting from 1582.");
            } else {
                System.out.println("--- Part 1: Nested If-Else Result ---");
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else if (year % 100 == 0) {
                    System.out.println(year + " is not a Leap Year");
                } else if (year % 4 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }

                System.out.println("\n--- Part 2: Single If Statement Result ---");
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer year.");
        }
        scanner.close();
    }
}