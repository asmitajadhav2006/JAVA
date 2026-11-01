
//abstaction :showing essential details and hide implementation 
//abstract class it cannot be instanciated(object cannot be created) and act as a superclass of subclasses that are sharing the same interfce
/*abstract class bird  {
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
}*/
/*interface Father {
    void skills();
}

interface Mother {
    void talent();
}

class Child implements Father, Mother {

    public void skills() {
        System.out.println("Good at coding");
    }

    public void talent() {
        System.out.println("Good at singing");
    }
}

public class test {
    public static void main(String[] args) {

        Child c = new Child();

        c.skills();
        c.talent();
    }
}*/
// Creating an interface
interface Animal {
    void sound();
}

// Implementing interface
class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

// Another class implementing interface
class Cat implements Animal {

    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class test {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        c.sound();
    }
}
