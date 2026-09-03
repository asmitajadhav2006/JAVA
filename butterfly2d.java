public class butterfly2d {

    static void butterfly(int n) {

        int rows = 2 * n - 1;
        int columns = 2 * n;

        char[][] arr = new char[rows][columns];

        // Fill entire array with spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = ' ';
            }
        }

        // Create butterfly
        for (int i = 0; i < rows; i++) {

            int stars;

            if (i < n) {
                stars = i + 1;
            } else {
                stars = rows - i;
            }

            // Left stars
            for (int j = 0; j < stars; j++) {
                arr[i][j] = '*';
            }

            // Right stars
            for (int j = columns - stars; j < columns; j++) {
                arr[i][j] = '*';
            }
        }

        // Print 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        butterfly(5);

    }
}