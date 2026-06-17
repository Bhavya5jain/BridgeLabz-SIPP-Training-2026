package coreJavaPractice.gcr_codebase.String.LEVEL1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void handleException(String text) {

        try {
            System.out.println(text.substring(5, 2));
        } catch (RuntimeException e) {
            System.out.println("IllegalArgumentException Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        handleException(text);

        sc.close();
    }
}