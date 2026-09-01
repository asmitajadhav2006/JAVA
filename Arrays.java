import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        int[][] arr = new int[3][4];

        Scanner sc = new Scanner(System.in);

        // Input
        for (int i = 0; i <= arr.length - 1; i++) {

            for (int j = 0; j <= arr[i].length - 1; j++) {

                System.out.println("Provide value for row = " + i + ", column = " + j);

                arr[i][j] = sc.nextInt();
            }
        }

        // Print
        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {

            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {

                System.out.print(arr[rowIndex][colIndex] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}