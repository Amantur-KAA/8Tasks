package org.example;
import java.util.Scanner;
public class Task6 {
    public static void printLongestWord() {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }
        System.out.println(longestWord);
        System.out.println(longestWord.length());
    }

    public static void main(String[] args) {
        printLongestWord();
    }
}
