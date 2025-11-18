package org.example;

import java.util.Scanner;

public class Task8 {
    static Scanner sc = new Scanner(System.in);
    public static void checkPalindrome() {
        String word = sc.nextLine();

        boolean isPalindrome = true;
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static void main() {
        checkPalindrome();
    }
}

