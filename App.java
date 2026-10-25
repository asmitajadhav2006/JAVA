
public class App {
    public static void main(String[] args) {

        // Default constructor
       /*  Student A = new Student();

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

        // Parameterized constructor
        Student C = new Student(19, 21, "Rohit", 6,"Riya");
        System.out.println(C.name);
        System.out.println(C.age);
        System.out.println(C.id);
        System.out.println(C.nos);
       // C.gfchatting();// private
        C.bunk();*/
//perfect enCAPSULATION ALL ATTRIBUTE SHOULD BE PRIVATE 
        Student D = new Student(20, 22, "Rohit", 6,"Riya");  
        System.out.println(D.getId());
        System.out.println(D.getAge());
        System.out.println(D.getName());
        System.out.println(D.getNos());
        System.out.println(D.getGf()); 
        D.setAge(800);
        System.out.println(D.getAge());
        D.setName("Riya");
        System.out.println(D.getName());
        D.setGf("Asmita");
        System.out.println(D.getGf());
    }
}
