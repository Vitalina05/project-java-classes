package tasks;

import java.util.Scanner;

public class Task2ManualImpl {
    public static void main(String argv[]) {
        int sum = 0;

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];

        System.out.println("Please enter numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();

            sum += numbers[i];
        }
        System.out.println("Sum of array elements equals " + sum);
    }
}