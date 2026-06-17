package coreJavaPractice.story_based_problem.MATH_WIZARD;

import java.util.Scanner;

public class MathWizard {

    int instanceVariable = 100;

    public boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public double factorial(double n) {

        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    public void fibonacci(int n) {

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public long power(int base, int exp) {

        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public void demonstrateScope() {

        int instanceVariable = 50;

        System.out.println("Local Variable = " + instanceVariable);
        System.out.println("Instance Variable = " + this.instanceVariable);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MathWizard mw = new MathWizard();

        int n = sc.nextInt();

        System.out.println("Prime: " + mw.isPrime(n));
        System.out.println("Factorial(int): " + mw.factorial(n));
        System.out.println("Factorial(double): " + mw.factorial((double) n));

        System.out.print("Fibonacci Series: ");
        mw.fibonacci(n);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD: " + mw.gcd(a, b));
        System.out.println("LCM: " + mw.lcm(a, b));

        int base = sc.nextInt();
        int exp = sc.nextInt();

        System.out.println("Power: " + mw.power(base, exp));

        mw.demonstrateScope();

        sc.close();
    }
}