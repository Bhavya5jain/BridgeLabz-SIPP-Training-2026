package coreJavaPractice.gcr_codebase.Control_Flow.LEVEL1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double x;

        while (true) {
            x = sc.nextDouble();
            if (x == 0) break;
            sum += x;
        }

        System.out.println("Total = " + sum);
    }
}
