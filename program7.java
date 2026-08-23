import java.util.Scanner;
public class program7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int age=sc.nextInt();
        if(age>18){
        System.out.println("adult");
        }
        else{
        System.out.println("children");
        } 
}
}
