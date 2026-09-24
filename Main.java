import java.util.*;

public class Main {
    public static void main(String[] args) {// min max  in  A SINGLE TRAVERSAL
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
        // COPY ARRAY INTO ANOTHER ANOTHER
        /*Scanner sc = new Scanner(System.in);

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
}*///ALTERNATE SWAP OF ELEMENTS

      /* Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.println("After alternate swap:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*//*5. Find Unique Element Approach 1 — Replace Duplicate With 0*/

       /*  Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    arr[i] = 0;
                    arr[j] = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.println("Unique element = " + arr[i]);
            }
        }
    }
}*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int unique = 0;

        for (int i = 0; i < n; i++) {
            unique = unique ^ arr[i];
        }

        System.out.println("Unique element = " + unique);
    }
}