package org.example;
import java.util.Scanner;
public class Task5 {
    public static void printLastWord() {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String lastWord = "";
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    lastWord = currentWord;
                    currentWord = "";
                }
            }
        }
        if (!currentWord.equals("")) {
            lastWord = currentWord;
        }

        System.out.println(lastWord);
    }

    public static void main(String[] args) {
        printLastWord();
    }
}
