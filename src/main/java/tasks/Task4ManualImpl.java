package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task4ManualImpl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first array");
        String firstLine = input.nextLine();
        String[] stringArray = firstLine.split(" ");

        Integer[] objects = Arrays.asList(stringArray).stream()
                .map(Integer::valueOf)
                .toArray(Integer[]::new);

        System.out.println("Enter second array:");
        String secondLine = input.nextLine();
        String[] stringArray2 = secondLine.split(" ");

        Integer[] objects2 = Arrays.asList(stringArray2).stream()
                .map(Integer::valueOf)
                .toArray(Integer[]::new);

        List<Integer> sameElements = new ArrayList<>();
        for (int i : objects) {
            for (int j : objects2) {
                if (i == j) sameElements.add(i);
            }
        }
        System.out.println("Common elements in two arrays are:" +  sameElements);
    }
}
