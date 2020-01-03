package utils;

public class ArrayUtils {
    public int getMax(int[] inputArray) {
        int maxElement = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxElement) {
                maxElement = inputArray[i];
            }
        }
        return maxElement;
    }

    public int getMin(int[] inputArray) {
        int minElement = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minElement) {
                minElement = inputArray[i];
            }
        }
        return minElement;
    }

}
