import java.util.Scanner;

public class program10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();
        System.out.println("Enter the number ");
        int b=sc.nextInt();
         System.out.println("Enter the number ");
         char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    
}
