package tasks;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Please, enter year:");
        Scanner input = new Scanner(System.in);
        String year = input.next();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, Integer.parseInt(year));
        calendar.set(Calendar.DAY_OF_YEAR, 256);

        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
        calendar.getFirstDayOfWeek();
        System.out.println("Day of the Programmer in " + year + " is " + dayOfWeek);
    }
}
