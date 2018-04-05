package homeTasks;
import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String argv[]) {
        int prev = 0;
        int curr = 1;
        int n=0;

        Scanner num = new Scanner(System.in);
        System.out.println("Enter number of members of the sequence: ");

        if (!num.hasNextInt() || n<=0) {
            System.out.println("No results");
        }
        else {
            n = num.nextInt();
            for (int i = 0; i < n; i++) {
                    int next = prev + curr;
                    prev = curr;
                    curr = next;

                    System.out.println(prev);
                }
            }
        }
    }

