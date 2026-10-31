
//abstaction :showing essential details and hide implementation 
//abstract class it cannot be instanciated(object cannot be created) and act as a superclass of subclasses that are sharing the same interfce
abstract class bird  {
 abstract void fly();

 abstract void eat();
 //extend in case of inheritance and implements in case of abstraction
}
class sparrow extends bird{
 @Override
 void fly(){
    System.out.println("Sparrow is flying");
 }
 @Override 
 void eat(){
    System.out.println("Sparrow is eating ");
 }

}
public class test{


    public static void main(String[] args) {
        bird s=new sparrow();
        
        s.fly();
        s.eat();
    }
}

