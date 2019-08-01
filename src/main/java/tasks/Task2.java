package tasks;

import java.util.Scanner;

public class Task2 {
    public static void main (String argv[]) {
        float averageValue = 0;
        float sum = 0;

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[2];

        System.out.println("Please enter numbers:");

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextDouble();

                sum += numbers[i];
                averageValue = sum / numbers.length;
        }
        System.out.println("Arithmetic mean of array elements equals " + averageValue);
    }
}