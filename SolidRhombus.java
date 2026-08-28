public class SolidRhombus {

    static void solidRhombus(int n) {

        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Stars
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        solidRhombus(4);
    }
}