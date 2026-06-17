package coreJavaPractice.gcr_codebase.String.LEVEL2;

import java.util.Scanner;

public class TrimStringWithoutTrim {

    public static int[] trimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() &&
                text.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 &&
                text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text,
                                         int start,
                                         int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String s1,
                                         String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] indexes = trimIndexes(text);

        String userTrim =
                createSubstring(text,
                        indexes[0],
                        indexes[1]);

        String builtInTrim = text.trim();

        System.out.println("User Trim = " + userTrim);
        System.out.println("Built-in Trim = " + builtInTrim);
        System.out.println(compareStrings(
                userTrim,
                builtInTrim));

        sc.close();
    }
}