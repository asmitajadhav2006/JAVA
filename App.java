
public class App {
    public static void main(String[] args) {

        // Default constructor
        Student A = new Student();

        // Assign values
        A.id = 18;
        A.age = 20;
        A.name = "Asmita";
        A.nos = 5;

        // Display student details
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);

        // Calling methods
        A.bunk();
        A.study();
        A.sleep();

        // Copy constructor
        Student B = new Student(A);

        // Display copied object details
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.nos);

        // Calling method using copied object
        B.sleep();
    }
}
