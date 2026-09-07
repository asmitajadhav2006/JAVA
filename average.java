public class average {
    static void Average2() {
        int arr[] = {2, 3, 4, 5};
        int n = arr.length;
        int Sum = 0;

        for (int i = 0; i <= n - 1; i++) {
            Sum += arr[i];
        }

        double average = (double) Sum / n;
        System.out.print("Average = " + average);
    }

    public static void main(String[] args) {
        Average2();
    }
}
