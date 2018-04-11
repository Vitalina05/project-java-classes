package homeTasks;

import com.company.Main;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator extends Main{

    public static void main(String[] argv) {

        System.out.println("Enter your phone number: ");
        String regex = "^[0-9]{10}$";

        Scanner num = new Scanner(System.in);
        String phoneNumber = num.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        while (!matcher.matches()) {
            try {
            System.out.println("Please, enter valid phone number: ");
                num.nextInt();

            break;
                 } catch (Exception e) {
                num.nextLine();
            }
        }


    }
}