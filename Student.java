
public class Student {
    //perfect encapsulation access it using public get set methods
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getNos() {
        return this.nos;
    }

    public String getGf() {
        return this.gf;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int a) {
        if(age<100){
        this.age = a;
        return;
        }
        else{
            System.out.println("Age should be less than 100");
        }
    }

    public void setNos(int nos) {
        this.nos = nos;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    /*  Attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;*/

    // Default constructor
    public Student() {
        System.out.println("Student Default ctor Called");
    }

    // Parameterized constructor
    public Student(int id, int age, String name, int nos,String gf) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf=gf;

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

    private void gfchatting(){
        System.out.println(name + "gfchatting");
    }
 }

