import java.util.Scanner;
public class program8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("year is not a leapyear");
        }
        else if(year%100==0){
            System.out.println("year is a leapyear");
        }
        else if(year%4==0){
            System.out.println("Year is not a leapyear ");

        }
        else{
            System.out.println("year is a leap year");
        }
    }
    
}
