public class evenodd {
    static void EvenOdd() {
        int arr[] = {2, 3, 4, 5};
        int n = arr.length;
        int evenCount = 0;
        int oddCount = 0;
    

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);
    }

    public static void main(String[] args) {
        EvenOdd();
    }
}
