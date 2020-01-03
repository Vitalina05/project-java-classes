package tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Please enter a word to check if it is a palindrome - ");
        Scanner w = new Scanner(System.in);
        String word = w.nextLine();

        Task7 palindrome = new Task7();

        if (palindrome.isPalindrome(word)) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("This is not palindrome");
        }
    }

    private boolean isPalindrome(String inputData) {
        int i = inputData.length() - 1;
        int j = 0;

        while (i > j) {
            if (inputData.charAt(i) != inputData.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
