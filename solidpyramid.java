public class solidpyramid {

    static void pyramid(int n) {

        for (int row = 1; row <= n; row++) {

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

        pyramid(n);
    }
}