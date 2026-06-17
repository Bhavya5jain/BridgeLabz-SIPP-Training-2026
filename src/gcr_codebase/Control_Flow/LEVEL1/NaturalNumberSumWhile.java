package gcr_codebase.Control_Flow.LEVEL1;
import java.util.Scanner;
public class NaturalNumberSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) return;

        int i = 1, sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        int formula = n * (n + 1) / 2;

        System.out.println(sum == formula);
    }
}
