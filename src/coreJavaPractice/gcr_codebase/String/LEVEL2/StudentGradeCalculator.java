package coreJavaPractice.gcr_codebase.String.LEVEL2;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static int[][] generateScores(int n) {

        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {

            scores[i][0] =
                    (int)(Math.random() * 100);

            scores[i][1] =
                    (int)(Math.random() * 100);

            scores[i][2] =
                    (int)(Math.random() * 100);
        }

        return scores;
    }

    public static String grade(double percentage) {

        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";

        return "R";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        int[][] scores =
                generateScores(students);

        System.out.println(
                "Phy\tChem\tMath\tTotal\tAvg\tPer\tGrade");

        for (int i = 0; i < students; i++) {

            int total =
                    scores[i][0] +
                            scores[i][1] +
                            scores[i][2];

            double average =
                    Math.round((total / 3.0) * 100)
                            / 100.0;

            double percentage =
                    Math.round((total / 300.0 * 100)
                            * 100) / 100.0;

            System.out.println(
                    scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            total + "\t" +
                            average + "\t" +
                            percentage + "\t" +
                            grade(percentage));
        }

        sc.close();
    }
}