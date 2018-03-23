package homeTasks;

public class arrayAverage {


    public static void main(String argv[]) {

//        int a = 2;
//        int b = 2;
//        a = 3;
//        int c = a + b;

        Object arr[] = new Object[8];
        arr[0] = new Object();
        arr[1] = null;
        arr[2] = arr;
        arr[3] = 3;
        arr[4] = 0;
        arr[5] = 4;
        arr[6] = 12;
        arr[7] = 23;
        arr[8] = 2;


        int len = arr.length;

        System.out.println(len);
    }
}
