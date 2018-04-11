package homeTasks;

public class ArrayAverage {

        public static void main (String argv[]) {

            int [] numbers = {21,321,31,1,32,12,43,11,42,12};
            float averageValue = 0;
            float sum = 0;

                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                    averageValue = sum / numbers.length;
                }
                System.out.println("Arithmetic mean of array elements equals " + averageValue);

            }
}