package tasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] argv) {
        System.out.println("Enter your password (at least 8 characters, lower and upper letter, number and bottom underline: ");
        String regex = "^[A-Za-z0-9_]{8,}$";

        Scanner num = new Scanner(System.in);
        String phoneNumber = num.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        while (!matcher.matches()) {
            try {
                System.out.println("Please, enter valid password");
                num.nextInt();

                break;
            } catch (Exception e) {
                num.nextLine();
            }
        }
    }
}
