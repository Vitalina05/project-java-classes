package homeTasks;

public class fibonacciNumber {

    public static void main(String argv[]) {
        int prev = 0;
        int curr = 1;
        int n = 12;

        for (int i = 0; i < n; i++) {
            int next = prev+curr;
            prev = curr;
            curr = next;
            System.out.println(prev);
        }
    }
}
