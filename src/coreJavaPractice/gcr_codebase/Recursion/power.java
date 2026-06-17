package coreJavaPractice.gcr_codebase.Recursion;

import java.util.Scanner;

public class power {

    public static long powerValue(int x, int n) {

        if (n == 0) {
            return 1;
        }

        return x * powerValue(x, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(powerValue(x, n));

        sc.close();
    }
}