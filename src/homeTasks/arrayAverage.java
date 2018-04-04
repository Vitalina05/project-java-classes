package homeTasks;

public class arrayAverage {
    public static void main(String argv[]) {

        float [] arr = new float[6];
        float l = arr.length;

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        float arrayValue= (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5])/l;

        System.out.println(arrayValue);
    }
}