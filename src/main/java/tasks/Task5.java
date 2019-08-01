package tasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Please, enter the word to count it in the sentence: ");
        Scanner w = new Scanner(System.in);
        String word = w.nextLine();

        System.out.println("Please, enter the sentence:");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            count++;
        }

        System.out.println("Quantity word: " + word + " in the sentence equals " + count);
    }
}
