
class Shape {

    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class 1
class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
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

        Shape s1 = new Shape();
        s1.draw();

        Circle c = new Circle();
        c.draw();

        Shape s3 = new Rectangle();
        s3.draw();

    }
}
