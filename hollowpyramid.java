public class hollowpyramid {

    static void hollowPyramid(int n) {

        for (int row = 1; row <= n; row++) {

            // Print spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;

        hollowPyramid(n);
    }
    
}
