// Child class used to demonstrate protected access
public class AccessModifierChild extends AccessModifier {

    // Constructor passes student data to the parent class
    public AccessModifierChild(int studentId, String studentName, String program) {
        super(studentId, studentName, program);
    }

    // Protected data can be accessed in the child class
    public void showProtectedAccess() {

        System.out.println("Student ID : " + studentId);
        System.out.println("Program    : " + program);
    }
}