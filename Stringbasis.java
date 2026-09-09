import java.util.Scanner;
public class Stringbasis{
    public static void main(String[]args){

   /* String FirstName="ASHU";
    String LastName=new String("jadhav");
    System.out.println(FirstName.length());
    System.out.println(LastName.charAt(
        0));
}
//String can be mutable using string builder and stringpool

String name="Rana";
name="Bana";
System.out.println(" "+name);
}
} 
//comparision of string by three metho 1.== 2..equals() 3.equalignore case()

        String name1 = "Love";
        String name2 = "Love";

        if (name1 == name2) {
            System.out.println("Both the strings are same");
        } else {
            System.out.println("Both the strings are not same");
        }
    }

        String name1 = "Love";
        String name2 = "LOVE";

        if (name1.equals(name2)) {
            System.out.println("Both the strings are same");
        } else {
            System.out.println("Both the strings are not same");
        }
    }
}}
String name1 = "Love";
        String name2 = "LOVE";

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both the strings are same");
        } else {
            System.out.println("Both the strings are not same");
        }
    }}

//string input 
Scanner sc = new Scanner(System.in);
System.out.println("PROVIDE THE STRING CONTENT");
String str = sc.nextLine();
System.out.println("VALUE OF nextline "+str);
System.out.println("PROVIDE THE STRING CONTENT");
String str2 = sc.next();    
System.out.println("VALUE OF next "+str2);
}
}*/


        // 1. Creating a String
        String str = "Babbar";

        // 2. length()
        System.out.println("Length: " + str.length());

        // 3. charAt()
        System.out.println("Character at index 0: " + str.charAt(0));

        // 4. equals()
        String name = "BABBER";
        System.out.println("Equals: " + str.equals(name));

        // 5. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(name));


        // 6. startsWith()
        System.out.println("Starts with Bab: " + str.startsWith("Bab"));

        // 7. endsWith()
        System.out.println("Ends with bar: " + str.endsWith("bar"));


        // 8. isEmpty()
        String emptyString = "";
        System.out.println("Is Empty: " + emptyString.isEmpty());

        // 9. isBlank()
        String blankString = "   ";
        System.out.println("Is Blank: " + blankString.isBlank());


        // 10. trim()
        String name2 = "   Love Babbar   ";

        System.out.println("Before trim length: " + name2.length());

        String trimmedName = name2.trim();

        System.out.println("After trim: " + trimmedName);
        System.out.println("After trim length: " + trimmedName.length());


        // 11. toUpperCase()
        String love = "Love";
        System.out.println("Uppercase: " + love.toUpperCase());

        // 12. toLowerCase()
        String LOVE = "LOVE";
        System.out.println("Lowercase: " + LOVE.toLowerCase());


        // 13. substring()
        String str2 = "My Name is Love Babbar";

        // beginIndex = inclusive
        // endIndex = exclusive
        System.out.println("Substring: " + str2.substring(3, 7));


        // 14. contains()
        System.out.println("Contains Love: " + str2.contains("Love"));
        System.out.println("Contains Lover: " + str2.contains("Lover"));


        // 15. valueOf()
        int num = 5123;

        String numString = String.valueOf(num);

        System.out.println("Number: " + num);
        System.out.println("Number as String: " + numString);


        // 16. toCharArray()
        String name3 = "Babbar";

        char[] characters = name3.toCharArray();

        for (char ch : characters) {
            System.out.println("Value of char: " + ch);
        }


        // 17. split()
        String input = "My,name,is,love,Babbar";

        String[] words = input.split(",");

        for (String word : words) {
            System.out.println(word);
        }


        // 18. replace()
        String name4 = "babbar";

        String replacedName = name4.replace('b', 'B');

        System.out.println("After replace: " + replacedName);


        /*
        =====================================================
        EXTRA EXAMPLES — NOT NECESSARY FOR BASIC PRACTICE
        =====================================================

        // String is immutable.
        // trim(), replace(), toUpperCase(), etc.
        // return a NEW String.

        String test = "   Hello   ";

        test.trim();

        System.out.println(test);
        // Original String is unchanged.

        test = test.trim();

        System.out.println(test);
        // Now test contains the trimmed String.
        */

    }
}

