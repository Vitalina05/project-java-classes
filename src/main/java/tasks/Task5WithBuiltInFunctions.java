package tasks;

import java.util.Scanner;

public class Task5WithBuiltInFunctions {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence:");
        Scanner w = new Scanner(System.in);
        String strInput = w.nextLine();

        String strOutput = strInput.replaceAll(" ", "");

        System.out.print("Your sentence: " + strInput + "\n");
        System.out.print("Your sentence without spaces: " + strOutput);
    }
}
