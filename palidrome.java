public class palidrome {
    
    //method 1 created original and new string and compared them
  /*   public static void main(String[] args) {

        String str = "madam";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
  */
 
public static void main(String[] args) {
        String str = "madam";
        int n = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

    /*public static void main(String[] args) {

        String str = "madam";
        boolean palindrome = true;

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                palindrome = false;
                break;
            }

            i++;
            j--;
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
*/
