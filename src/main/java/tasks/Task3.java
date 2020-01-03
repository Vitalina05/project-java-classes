package tasks;

import utils.ArrayUtils;

import java.util.Scanner;

class Task3 {
    public static ArrayUtils propertyValue;

    public static void main(String[] args) {
        propertyValue = new ArrayUtils();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you wants to enter: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter [" + (i + 1) + "] element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Max element in Array is: " + propertyValue.getMax(arr) + "\n");
        System.out.print("Min element in Array is: " + propertyValue.getMin(arr));
    }
}