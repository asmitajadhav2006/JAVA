import java.util.Scanner;
public class Dsabasicmath {
    public static void main(String[] args) {
        /* ARITHMATIC PROBLEM
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        if (b != 0) {
            int quotient = a / b;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);
        */
      // Problem 1: Count Digits in a Number

      /*   int n = 12345;
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Number of digits = " + count);*/
        //3. Digits of a Number

        /*int n = 1234;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);*/
        //Problem 3: Reverse a Number
        /*int n = 1234;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reversed number = " + rev);*/
       // 4. Even and Odd Number
        /*int n = 7;

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}*/
//Problem 4: Palindrome Number
    /*   Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (original == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();*/
      //  Problem 5: Prime Number
       /* int n = 7;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}*/
//Problem 6: Factorial
        /*int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}
*/
       /*Problem 7: GCD (Greatest Common Divisor)
 int a = 12;
        int b = 18;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
    }
}*/
//Problem 8: LCM

      /*  int a = 12;
        int b = 18;

        int x = a;
        int y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);
    }
}
*/
//Problem 9: Armstrong Number
        int n = 153;
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
