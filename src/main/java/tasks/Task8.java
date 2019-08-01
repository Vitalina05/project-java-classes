package tasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] argv) {
        System.out.println("Enter your password (at least 8 characters, numbers, lower and upper letters):");
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";

        Scanner p = new Scanner(System.in);
        String password = p.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        while (!matcher.matches()) {
            System.out.println("Please, enter valid password");
            password = p.nextLine();
            matcher = pattern.matcher(password);
        }
        System.out.println("Your password is correct!");
    }
}
