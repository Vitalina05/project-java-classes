package homeTasks;

public class arrayAverage {


    public static void main(String argv[]) {

        int [] arr = new int[5];
        int l = arr.length;

        arr[0] = 2;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 2;
       // int length = arr.length;
        int arrayValue= (arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5])/l;

        System.out.println(arrayValue);
    }
}
