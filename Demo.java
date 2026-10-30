
class Shape {

    public void draw() {
        System.out.println("Drawing a shape");
    }
}
//run time polymorphism take decision when object is made and occur at runntime 
// Child class 1// draw is polymorphic 
class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    public void circleSpecificMethod() {
        System.out.println("This is a method specific to Circle");
    }
}

// Child class 2
class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class
public class Demo{

    public static void main(String[] args) {

     /*   Shape s1 = new Shape();
        s1.draw();

        Circle c = new Circle();
        c.draw();

        Rectangle s3 = new Rectangle();
        s3.draw();
        //Runtime polymorphism upcasting 
        Circle c=new Circle();
        doSomething(c);
        Rectangle r=new Rectangle();
        doSomething(r);
        Shape s=new Shape();
        doSomething(s);*/
        //Downcasting
      // Circle c=new Circle();
        //doSomething(c);
        Rectangle r=new Rectangle();
        doSomething(r);

    }
    public static void  doSomething(Shape s){
        s.draw();//polymorphic behavior
        Circle r=(Circle)s;//downcasting
        r.circleSpecificMethod();//DOWNCASTING

        

    }

}
