import java.util.Scanner;

public class conversion {
    //If you want to convert decimal → binary
    /*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] bits = new int[32];
        int i = 0;

        while (n != 0) {
            int bit = n & 1;
            bits[i] = bit;

            n = n >> 1;
            i++;
        }

        System.out.print("Binary is: ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bits[j]);
            } */
//If you want to convert decimal → binary
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] bits = new int[32];
        int i = 0;

        while (n != 0) {

            int bit = n & 1;
            bits[i] = bit;

            n = n >> 1;
            i++;
        }

        System.out.print("Binary is: ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bits[j]);
        }
    }
}