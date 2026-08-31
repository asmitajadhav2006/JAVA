
import java.util.Scanner;

public class Arraybasis {

    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        int n = arr.length;

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("Provide input for index " + i);
            arr[i] = sc.nextInt();
        }

        // Print
        System.out.println("Your array contains:");

        for (int val : arr) {
            System.out.println(val);
        }

        sc.close();
    }
}

