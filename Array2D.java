public class Array2D {

    public static void main(String[] args) {

        int[][] brr = {
            {1, 2},
            {2, 3, 4, 5},
            {3, 4, 4, 5, 6, 7},
            {4}
        };

        // System.out.println(brr[3][1]); // This would give ArrayIndexOutOfBoundsException

        int rowLength = brr.length;

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

