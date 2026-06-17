package coreJavaPractice.gcr_codebase.Control_Flow.LEVEL1;
import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) return;

        int fact = 1, i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println(fact);
    }
}
