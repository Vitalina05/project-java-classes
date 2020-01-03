package tasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task2WithBuiltInFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Please enter numbers:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = IntStream.of(array).sum();
        System.out.println("Sum of array elements equals " + sum);
    }
}