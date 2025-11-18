package org.example;
import java.util.Scanner;
public class Task3 {
    public static void swapLetters() {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a') {
                result.append('b');
                count++;
            } else if (ch == 'b') {
                result.append('a');
                count++;
            } else if (ch == 'A') {
                result.append('B');
                count++;
            } else if (ch == 'B') {
                result.append('A');
                count++;
            } else {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
        System.out.println(count);
    }
    public static void main(String[] args) {
        swapLetters();
    }
}
