package gcr_codebase.String.LEVEL1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void handleException(String text) {

        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        handleException(text);

        sc.close();
    }
}