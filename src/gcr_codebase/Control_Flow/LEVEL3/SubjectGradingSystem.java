package gcr_codebase.Control_Flow.LEVEL3;

import java.util.Scanner;

public class SubjectGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Physics marks: ");
            double physics = scanner.nextDouble();
            System.out.print("Enter Chemistry marks: ");
            double chemistry = scanner.nextDouble();
            System.out.print("Enter Maths marks: ");
            double maths = scanner.nextDouble();

            if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
                System.out.println("Marks should be between 0 and 100.");
                return;
            }

            double totalMarks = physics + chemistry + maths;
            double percentage = (totalMarks / 300.0) * 100;

            char grade;
            String remarks;

            if (percentage >= 80.0) {
                grade = 'A';
                remarks = "(Level 4, above agency-normalized standards)";
            } else if (percentage >= 70.0) {
                grade = 'B';
                remarks = "(Level 3, at agency-normalized standards)";
            } else if (percentage >= 60.0) {
                grade = 'C';
                remarks = "(Level 2, below, but approaching agency-normalized standards)";
            } else if (percentage >= 50.0) {
                grade = 'D';
                remarks = "(Level 1, well below agency-normalized standards)";
            } else if (percentage >= 40.0) {
                grade = 'E';
                remarks = "(Level 1- , too below agency-normalized standards)";
            } else {
                grade = 'R';
                remarks = "(Remedial standards)";
            }

            System.out.println("\n============ REPORT CARD ============");
            System.out.printf("Average Percentage: %.2f%%\n", percentage);
            System.out.println("Assigned Grade:     " + grade);
            System.out.println("Remarks:            " + remarks);
            System.out.println("=====================================");

        } catch (Exception e) {
            System.out.println("Invalid entry. Please use decimal or integer points for marks.");
        } finally {
            scanner.close();
        }
    }
}