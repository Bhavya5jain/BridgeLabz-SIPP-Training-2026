package coreJavaPractice.gcr_codebase.Control_Flow.LEVEL1;
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        while (true) {
            double x = sc.nextDouble();

            if (x <= 0) break;

            sum += x;
        }

        System.out.println("Total = " + sum);
    }
}
