package tasks;

import java.util.Calendar;
import java.util.Date;

public class Task9 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setTime(date);

        Calendar oldDateInCalendar = Calendar.getInstance();
        oldDateInCalendar.set(1994, 8, 5);

        long milisecondsDate = currentCalendar.getTimeInMillis() - oldDateInCalendar.getTimeInMillis();
        Date dateInFormat = new Date(milisecondsDate * 1000);

        System.out.println("The difference between today is " + milisecondsDate + " (in miliseconds)");
        System.out.println("The difference between today is " + dateInFormat + " (in correct format)");
    }
}