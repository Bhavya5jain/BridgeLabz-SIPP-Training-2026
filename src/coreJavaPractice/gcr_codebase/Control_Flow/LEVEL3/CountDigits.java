package coreJavaPractice.gcr_codebase.Control_Flow.LEVEL3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int count = 0;

            if (number == 0) {
                count = 1;
            } else {
                int temp = Math.abs(number);
                while (temp != 0) {
                    temp = temp / 10;
                    count++;
                }
            }
            System.out.println("Number of digits: " + count);
        } else {
            System.out.println("Invalid integer input.");
        }
        scanner.close();
    }
}