public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    //overlading add,3 innt addition
     int add(int a,int b,int c){
        return a+b+c;
     }

     double add(int a,int b,int c,double d){
        return a+b+c+d;
     }
     
    
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10,20,30,40.5));
    }
}
