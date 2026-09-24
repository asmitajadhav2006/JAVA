import java.util.*;

public class Main {
    public static void main(String[] args) {
     /*    Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Copied array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}