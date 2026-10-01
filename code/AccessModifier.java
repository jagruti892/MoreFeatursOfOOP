// Demonstrates public, private and protected access modifiers
public class AccessModifier {

    // Public data
    public int studentId;

    // Private data
    private String studentName;

    // Protected data
    protected String program;

    // Constructor to initialize student data
    public AccessModifier(int studentId, String studentName, String program) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.program = program;
    }

    // Accessing all data inside the same class
    public void showInsideClassAccess() {

        System.out.println("Inside AccessModifierDemo class:");

        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Program      : " + program);
    }

    // Private data is accessed through a public method
    public void showPrivateData() {

        System.out.println("Private Student Name: " + studentName);
    }
}