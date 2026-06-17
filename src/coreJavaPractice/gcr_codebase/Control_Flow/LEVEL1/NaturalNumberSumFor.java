package coreJavaPractice.gcr_codebase.Control_Flow.LEVEL1;
import java.util.Scanner;
public class NaturalNumberSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int formula = n * (n + 1) / 2;

        System.out.println(sum == formula);
    }
}
