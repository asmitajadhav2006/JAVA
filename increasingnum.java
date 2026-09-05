public class increasingnum{
    public static void numberTriangle(int n) {
    int[][] a = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            a[i][j] = j + 1;
        }
    }

    print(a);
}