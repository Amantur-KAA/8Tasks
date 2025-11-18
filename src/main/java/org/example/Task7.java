package org.example;
import java.util.Scanner;
public class Task7 {
    public static void countWords() {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        Scanner lineScanner = new Scanner(text);
        int count = 0;

        while (lineScanner.hasNext()) {
            lineScanner.next();
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countWords();
    }
}
