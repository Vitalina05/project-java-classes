package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your numbers:");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        iAmSum(num, sum);
    }

    public static void iAmSum(int num, int sum) {
        if (num > 0) {
            sum += num % 10;
            iAmSum(num / 10, sum);
        } else

            switch (sum) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Your sum is " + sum);
                    break;
                case 6:
                    System.out.println("Your sum is " + sum);
                    break;
                case 7:
                    System.out.println("Your sum is " + sum);
                    break;
                case 8:
                    System.out.println("Your sum is " + sum);
                    break;
                case 9:
                    System.out.println("Your sum is " + sum);
                    break;
                default:
                    iAmSum(sum,0);
                    break;
            }
    }
}