public class arraymax {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int max = arr[0];

        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {

            int value = arr[i];

            if (value > max) {
                max = value;
            }
        }

        // Max is ready to print
        System.out.println("Max = " + max);
    }
    
}
