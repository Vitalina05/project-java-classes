package tasks;

public class MinAndMaxElementInArray {
    public static void main(String[] args) {
        int[] list = {15, 26, 37, 8, 16, 22, 58, -7, -19, 12, 30};

        int min = list[0];
        int max = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
                else if (list[i] > max)
                    max = list[i];
        }
        System.out.println("Min element in Array is " + min);
        System.out.println("Max element in Array is " + max);
    }
}
