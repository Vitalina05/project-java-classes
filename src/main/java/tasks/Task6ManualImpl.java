package tasks;

import java.util.Scanner;

public class Task6ManualImpl {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence:");
        Scanner w = new Scanner(System.in);
        String strInput = w.nextLine();
        String withoutSpaces = "";

        for (int i = 0; i < strInput.length(); i++) {
            if (strInput.charAt(i) != ' ')
                withoutSpaces += strInput.charAt(i);
        }

        System.out.print("Your sentence: " + strInput + "\n");
        System.out.print("Your sentence without spaces: " + withoutSpaces);
    }
}
