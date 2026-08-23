import java.util.Scanner;
public class program15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
