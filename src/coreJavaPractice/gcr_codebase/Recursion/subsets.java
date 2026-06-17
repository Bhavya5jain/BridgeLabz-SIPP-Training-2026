package coreJavaPractice.gcr_codebase.Recursion;

import java.util.Scanner;

public class subsets {

    public static void generateSubsets(int[] arr, int index, String current) {

        if (index == arr.length) {
            System.out.println("[" + current + "]");
            return;
        }

        generateSubsets(arr, index + 1, current);

        String next;

        if (current.isEmpty()) {
            next = String.valueOf(arr[index]);
        } else {
            next = current + "," + arr[index];
        }

        generateSubsets(arr, index + 1, next);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        generateSubsets(arr, 0, "");

        sc.close();
    }
}