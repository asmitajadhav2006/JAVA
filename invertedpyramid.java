public class invertedpyramid {
    static void invertedPyramid(int n) {

        for (int row = n; row >= 1; row--) {

            // Print spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;

        invertedPyramid(n);
    }
}
    
