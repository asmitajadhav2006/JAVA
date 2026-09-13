public class Pracarray {
    public static void main(String[] args) {
            //Method 2
        int[] arr = {1, 2, 4, 5, 6};
        int xor = 0;
        int n = arr.length + 1; 
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        for (int x : arr) {
            xor ^= x;
        }
        System.out.println("Missing element: " + xor);
    }
}
      //Method 1
      /*  int[] arr = {1, 2, 4, 5, 6};

        int n = arr.length + 1;

        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        int missing = total - sum;

        System.out.println("Missing element: " + missing);
    }
}*/