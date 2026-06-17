package coreJavaPractice.gcr_codebase.String.LEVEL3;

import java.util.Scanner;

public class PalindromeChecker {

    public static boolean palindromeLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static boolean palindromeRecursive(String text,
                                              int start,
                                              int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return palindromeRecursive(text,
                start + 1,
                end - 1);
    }

    public static String reverse(String text) {

        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean palindromeArray(String text) {

        char[] original = text.toCharArray();
        char[] reversed = reverse(text).toCharArray();

        for (int i = 0; i < original.length; i++) {

            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println("Loop Method : "
                + palindromeLoop(text));

        System.out.println("Recursive Method : "
                + palindromeRecursive(text,
                0,
                text.length() - 1));

        System.out.println("Array Method : "
                + palindromeArray(text));

        sc.close();
    }
}
