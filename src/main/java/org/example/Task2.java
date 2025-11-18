package org.example;
    import java.util.Scanner;
public class Task2 {
    public static void replaceLetters() {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String replaced = text.replace('a', 'b').replace('A', 'B');
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'A') {
                count++;
            }
        }
        System.out.println(replaced);
        System.out.println(count);
    }
    public static void main(String[] args) {
        replaceLetters();
    }
}
