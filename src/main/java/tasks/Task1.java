package tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your age:");
        int age = scanner.nextInt();

        System.out.println("Please, enter your (heart rate) pulse:");
        int pulse = scanner.nextInt();

        int maxPulse;
        maxPulse = 220 - age;
        System.out.println("Your max pulse is " + maxPulse);

        int targetZone90 = (int) Math.round(maxPulse * 0.9);
        int targetZone80 = (int) Math.round(maxPulse * 0.8);
        int targetZone70 = (int) Math.round(maxPulse * 0.7);
        int targetZone60 = (int) Math.round(maxPulse * 0.6);
        int targetZone50 = (int) Math.round(maxPulse * 0.5);

        System.out.println("Maximum pulse - 100%: " + maxPulse);
        System.out.println("VO2 max zone - 90-100%(maximum load): " + targetZone90 + '-' + maxPulse);
        System.out.println("Anaerobic zone - 80-90%(strength training): " + targetZone80 + '-' + targetZone90);
        System.out.println("Aerobic zone - 70-80%(running, bicycle): " + targetZone70 + '-' + targetZone80);
        System.out.println("Fat burning zone - 60-70%(fitness,roller-skates): " + targetZone60 + '-' + targetZone70);
        System.out.println("Light activity zone - 50-60%(warm-up): " + targetZone50 + '-' + targetZone60);
        System.out.println("Resting pulse 0%: " + pulse);
    }
}
