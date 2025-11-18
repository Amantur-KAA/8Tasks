package org.example;
import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);

    static void reverseA_B() {
        System.out.println("'a' will change to 'b', 'A' to 'B' and in reverse");
        System.out.println("Enter your text:");
        String text = sc.nextLine();
        int count = 0;
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                chars[i] = 'b';
                count++;
            } else if (chars[i] == 'A') {
                chars[i] = 'B';
                count++;
            } else if (chars[i] == 'b') {
                chars[i] = 'a';
                count++;
            } else if (chars[i] == 'B') {
                chars[i] = 'A';
                count++;
            }
        }

        String result = new String(chars);
        System.out.println(result);
        System.out.println(count);
    }

    public static void main(String[] args) {
        reverseA_B();
    }
}

