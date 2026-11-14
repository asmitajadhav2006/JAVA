public class increasingnum {

    public static void numberTriangle(int n) {
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = j + 1;
            }
        }

        print(a);
    }

    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberTriangle(5);
    }
}