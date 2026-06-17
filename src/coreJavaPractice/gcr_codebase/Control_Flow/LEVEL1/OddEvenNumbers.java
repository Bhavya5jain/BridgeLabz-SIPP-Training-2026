package coreJavaPractice.gcr_codebase.Control_Flow.LEVEL1;
import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + " Even");
            else
                System.out.println(i + " Odd");
        }
    }
}
