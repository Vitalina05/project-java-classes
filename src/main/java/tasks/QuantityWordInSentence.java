package tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class QuantityWordInSentence {
    public static void main(String[] args) {
        String s = "mev a big family, mev a one of the favorite family, we are mev";
        Pattern pattern = Pattern.compile("mev");
        Matcher matcher = pattern.matcher(s);

        int count = 0;
        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }
        System.out.println("Quantity words in the sentence = " + count);
    }
}
