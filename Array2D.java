public class Array2D {

    public static void main(String[] args) {

        int[][] brr = {
            {1, 2},
            {2, 3, 4, 5},
            {3, 4, 4, 5, 6, 7},
            {4}
        };

        // System.out.println(brr[3][1]); // This would give ArrayIndexOutOfBoundsException

/*       int rowLength = brr.length;

        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {

            // Find the number of columns in the current row
            int colLength = brr[rowIndex].length;

            for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {

                System.out.print(brr[rowIndex][colIndex] + " ");
            }

            System.out.println();
        }
    }
}
*/
//Problem 13: Print All Prime Numbers from 1 to n

        int n = 20;

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}

