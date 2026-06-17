package gcr_codebase.String.LEVEL1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void handleException(String[] names) {

        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        handleException(names);

        sc.close();
    }
}