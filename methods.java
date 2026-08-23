public class methods {
   /*  static void print2katable(){
        for(int i=1;i<=10;i++){
            int ans=2*i;
            System.out.println("- "+ans);
        }
        }*/
         static void printSum(int x,int y){
            
                System.out.println("SUM"+(x+y));
            }

         static void printmultiplication(int a,int b){
            System.out.println("MULTIPLICATION: "+(a*b));
         }
        static int add(int k,int l){
            int sum=k+l;
            return sum;
        }
         public static void main(String[] args){
           // printSum(5,6);
            //printmultiplication(5,6);
            int result=add(5,6);
            System.out.println("Result is: "+result);
          //  System.out.println("Hi");
            //print2katable();
            //System.out.println("Bye");

        }
        
    }
