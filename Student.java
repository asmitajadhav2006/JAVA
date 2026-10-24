
public class Student {

    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default constructor
    public Student() {
        System.out.println("Student Default ctor Called");
    }

    // Parameterized constructor
    public Student(int id, int age, String name, int nos) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;

        System.out.println("Student Parameterised ctor Called");
    }

    // Copy constructor
    public Student(Student srcobj) {
        System.out.println("Student Copy ctor Called");

        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    // Methods / Behaviours
    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(name + " sleeping");
    }

    public void bunk() {
        System.out.println(name + " Bunking");
    }
}
