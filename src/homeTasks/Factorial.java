package homeTasks;

public class Factorial {

    public static void main(String argv[]) {

        int a = 1;
        int b = 10;

        for (int i = 1; i<=b; i++){
            a=a*i;
        }
        System.out.print(b+"!=" + a);
        }
}

///       int result = 1;
//        if (x != 0) {
//            return x * factorial(x - 1);
//        }
//        if (x == 0) return 1;
//        return result;