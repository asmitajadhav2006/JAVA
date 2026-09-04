public class xpattern2d {public class Main {

    static void xPattern(int n) {

        char[][] arr = new char[n][n];

        // Fill array with spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ' ';
            }
        }

        // Put stars in X positions
        for (int i = 0; i < n; i++) {

            arr[i][i] = '*';

            arr[i][n - i - 1] = '*';
        }

        // Print the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        xPattern(5);

    }
}
    
}
