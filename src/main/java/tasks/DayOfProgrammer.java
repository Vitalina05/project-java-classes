package tasks;

public class DayOfProgrammer {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int thisYEar = 2018;
        int amountDaysInCurrentYear = 365;
        int quantityDaysOfSeptember = 30; // because day of the programmer in september
        int orderOfDays = 256; // 256th day in year

        int howManyDays = ((thisYEar-1901)*amountDaysInCurrentYear + quantityDaysOfSeptember + orderOfDays - 1);
        int whatDay = (howManyDays%7);

       System.out.println("Day of the Programmer is " + days[whatDay]);
    }
}
