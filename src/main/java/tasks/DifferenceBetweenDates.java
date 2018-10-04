package tasks;

import java.util.Date;

public class DifferenceBetweenDates {
    public static void main(String[] args) {
        Date oldDate = new Date(1438722000000l); // Wed Aug 05 2015 00:00:00
        Date todayDate = new Date();// today

        long milisecondsDate = (todayDate.getTime() - oldDate.getTime())/1000;
        Date dateInFormat = new Date(milisecondsDate * 1000);

        System.out.println("The difference between today is " + milisecondsDate + " (in miliseconds)");
        System.out.println("The difference between today is " + dateInFormat + " (in correct format)");

    }

}