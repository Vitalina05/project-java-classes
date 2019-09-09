package tasks;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you wants to enter: " );
        n=sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i < arr.length; i++)
        {
            System.out.print("Enter ["+(i + 1)+"] element: " );
            arr[i] = sc.nextInt();
        }

        Task2 mm = new Task2();

        System.out.print("Max element in Array is: " +mm.getMax(arr) + "\n");
        System.out.print("Min element in Array is: " +mm.getMin(arr));
    }

    private int getMax(int[]inputArray) {
        int maxElement = inputArray[0];

        for(int i = 1;i < inputArray.length; i++)
        {
            if(inputArray[i] > maxElement)
            {
                maxElement = inputArray[i];
            }
        }
        return maxElement;
    }

    private int getMin(int[]inputArray) {
        int minElement = inputArray[0];

        for(int i = 1;i < inputArray.length; i++)
        {
            if(inputArray[i] < minElement)
            {
                minElement = inputArray[i];
            }
        }
        return minElement;
    }
}