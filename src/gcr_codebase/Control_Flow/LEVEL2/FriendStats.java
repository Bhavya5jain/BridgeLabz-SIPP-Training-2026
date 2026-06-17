package gcr_codebase.Control_Flow.LEVEL2;

import java.util.Scanner;

public class FriendStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Amar's age: ");
            int amarAge = scanner.nextInt();
            System.out.print("Enter Amar's height: ");
            double amarHeight = scanner.nextDouble();

            System.out.print("Enter Akbar's age: ");
            int akbarAge = scanner.nextInt();
            System.out.print("Enter Akbar's height: ");
            double akbarHeight = scanner.nextDouble();

            System.out.print("Enter Anthony's age: ");
            int anthonyAge = scanner.nextInt();
            System.out.print("Enter Anthony's height: ");
            double anthonyHeight = scanner.nextDouble();

            String youngest;
            if (amarAge < akbarAge && amarAge < anthonyAge) {
                youngest = "Amar";
            } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
                youngest = "Akbar";
            } else {
                youngest = "Anthony";
            }

            String tallest;
            if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
                tallest = "Amar";
            } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
                tallest = "Akbar";
            } else {
                tallest = "Anthony";
            }

            System.out.println("\nYoungest friend is: " + youngest);
            System.out.println("Tallest friend is: " + tallest);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers appropriately.");
        }
        scanner.close();
    }
}
