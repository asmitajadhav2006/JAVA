public class method3 {
    class Main {

    // 1. Welcome message
    static void printWelcomeMessage() {
        System.out.println("Welcome to Java Programming!");
    }

    // 2. Addition
    static int add(int a, int b) {
        return a + b;
    }

    // 3. Check even
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 4. Find maximum
    static int getMaximum(int a, int b) {
        return Math.max(a, b);
    }

    // 5. Calculate percentage
    static double calculatePercentage(int obtained, int total) {
        return ((double) obtained / total) * 100;
    }

    // 6. Method overloading
    static void display(int number) {
        System.out.println("Integer: " + number);
    }

    static void display(String text) {
        System.out.println("String: " + text);
    }

    // 7. Pass by value
    static void updateValue(int x) {
        x = 100;
        System.out.println("Inside method: " + x);
    }

    public static void main(String[] args) {

        printWelcomeMessage();

        System.out.println("Sum = " + add(10, 20));

        System.out.println("Is Even = " + isEven(10));

        System.out.println("Maximum = " + getMaximum(25, 40));

        System.out.println(
            "Percentage = " + calculatePercentage(450, 500) + "%"
        );

        display(100);
        display("Hello Java");

        int value = 50;

        System.out.println("Before method = " + value);

        updateValue(value);

        System.out.println("After method = " + value);
    }
}
    
}
