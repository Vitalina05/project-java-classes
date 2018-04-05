package homeTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {

    public static void main(String[] argv) {
        System.out.println("Enter phone number: ");

        Scanner num = new Scanner(System.in);
        String phoneNumber = num.nextLine();
        String regex = "^[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println("Phone Number is valid");
        } else {
            System.out.println("Phone Number is invalid");
        }
    }
}
