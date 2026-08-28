public class star {public class Pattern3 {

    static void reverseTriangle(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        reverseTriangle(4);
    }
}
    
}
