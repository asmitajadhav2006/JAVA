public class methods2 {
/* This is a simple Java class with static methods 
static void printwelcome(){
    System.out.println("Welcome to methods");}
static int calculateTotal(int sloved,int bonous){
    return sloved+bonous;
}
static boolean isEligibleforBadge(int streakDay){
    return streakDay>=20;
}
public static void main(String[] args){
    printwelcome();
    int total=calculateTotal(10,5);
    System.out.println("Total is: "+total);
    boolean eligible=isEligibleforBadge(30);
    System.out.println("Eligible for badge: "+eligible);
}
}*/
//Execution flow and arguments passing in methods
 /*void slove(){
    System.out.println("I am solving");
    int ans=add(1,2);
    System.out.println("Answer is: "+ans);
System.out.println("I am done");
}

int add(int a,int b){
    System.out.println("I am adding");
    int sum=a+b;
    System.out.println("I am done adding");
    return sum;
}
    public static void main(String[] args){
        System.out.println("Hi");
       methods2 m=new methods2();
       m.slove();
    System.out.println("Bye");
}}*/
//methods with same names(method overloading)
/*static int add(int a, int b) {
    return a + b;
}
static double add(double a, double b) {
    return a + b;
}
static int add(int a, int b, int c) {
    return a + b + c;
}
public static void main(String[] args) {
    int sum1 = add(5, 10);
    double sum2 = add(5.5, 10.5);
    int sum3 = add(5, 10, 15);
    System.out.println("Sum of integers: " + sum1);
    System.out.println("Sum of doubles: " + sum2);
    System.out.println("Sum of three integers: " + sum3);
}
}*/
//call by value and call by reference
/*static void slove(int num) {
    System.out.println("Inside slove:"+num);
    num=num+10;
    System.out.println("Inside slove after adding 10:"+num);
}
public static void main(String[] args) {
    int number=5;
    System.out.println("inside main:"+number);
    slove(number);
    System.out.println("inside main after calling slove:"+number);
}
} */
//METHOD AND VARIABLE SCOPEING
static int value=20;

static void printmultiples(){
    for(int i=1;i<=10;i++){
        for(int j=1;j<=10;j++){
            int ans=value*j;
            System.out.println(ans);
        }
        System.out.println(value);
    }
}
public static void main(String[] args){
    System.out.println(value);
    printmultiples();
}
}

