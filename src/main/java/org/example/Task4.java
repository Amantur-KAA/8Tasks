package org.example;
import java.util.Scanner;
public class Task4 {
    public static void printFirstWord() {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String firstWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                break;
            }
            firstWord += ch;
        }
        System.out.println(firstWord);
    }

    public static void main(String[] args) {
        printFirstWord();
    }
}