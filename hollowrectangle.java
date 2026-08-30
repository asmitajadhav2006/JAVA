public class hollowrectangle {
    
    static void hollowRectangle(int rows, int cols) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                // Print stars for first and last row
                if (i == 1 || i == rows) {
                    System.out.print("*");
                } else {
                    // Print stars for first and last column
                    if (j == 1 || j == cols) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int rows = 4;
        int cols = 5;

        hollowRectangle(rows, cols);
    }
    
}
