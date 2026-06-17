package coreJavaPractice.gcr_codebase.Control_Flow.LEVEL2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Enter years of service: ");
            double yearsOfService = scanner.nextDouble();

            double bonus = 0.0;
            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            }

            System.out.printf("Bonus amount: $%.2f\n", bonus);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numerical values.");
        }
        scanner.close();
    }
}
