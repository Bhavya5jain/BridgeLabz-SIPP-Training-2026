package coreJavaPractice.story_based_problem.RECURSION;

import java.util.Scanner;

public class recursion {

    static int moveCount = 0;

    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {

        if (n == 1) {
            System.out.println("Move Disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move Disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static int binarySearch(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, right, target);
    }

    public static int sumOfDigits(int number) {

        if (number == 0) {
            return 0;
        }

        return number % 10 + sumOfDigits(number / 10);
    }

    public static String reverseString(String text) {

        if (text.length() <= 1) {
            return text;
        }

        return reverseString(text.substring(1)) + text.charAt(0);
    }

    public static boolean isBalanced(String text, int index, int count) {

        if (count < 0) {
            return false;
        }

        if (index == text.length()) {
            return count == 0;
        }

        char ch = text.charAt(index);

        if (ch == '(') {
            return isBalanced(text, index + 1, count + 1);
        }

        if (ch == ')') {
            return isBalanced(text, index + 1, count - 1);
        }

        return isBalanced(text, index + 1, count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int disks = sc.nextInt();

        towerOfHanoi(disks, 'A', 'B', 'C');
        System.out.println(moveCount);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(binarySearch(arr, 0, n - 1, target));

        int number = sc.nextInt();

        System.out.println(sumOfDigits(number));

        sc.nextLine();

        String text = sc.nextLine();

        System.out.println(reverseString(text));

        String expression = sc.nextLine();

        System.out.println(isBalanced(expression, 0, 0));

        sc.close();
    }
}