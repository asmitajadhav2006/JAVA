public class arraysum {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {

            int value = arr[i];

            sum = sum + value;
        }

        // Sum is ready to print
        System.out.println("Sum = " + sum);

        // Another array
        int[] arr2 = {12, 14, 1245};

        int n2 = arr2.length;

        System.out.println("Length of second array = " + n2);
    }
}

