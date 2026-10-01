// Represents a student of DCST
public class Student implements Reportable, Identifiable {

    private int studentId;
    private String name;
    private String program;
    private int year;
    private MemberType memberType;

    // Static counter shared by all Student objects
    private static int memberCount = 0;

    // Constructor to initialize all attributes
    public Student(int studentId, String name, String program, int year) {
        this.studentId = studentId;
        this.name = name;
        this.program = program;
        this.year = year;

        // Set the member type
        this.memberType = MemberType.STUDENT;

        // Increase the count when a new Student object is created
        memberCount++;
    }

    // Displays student details
    public void displayStudent() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Program    : " + program);
        System.out.println("Year       : " + year);
        System.out.println("Member Type: " + memberType);
    }

    // Changes the student's program
    public void setProgram(String program) {
        this.program = program;
    }

    // Static method to display the number of students created
    public static void displayMemberCount() {
        System.out.println("Total Student Members Created: " + memberCount);
    }

    // Implementation of Reportable interface
    @Override
    public void generateReport() {
        System.out.println("Generating student report for: " + name);
    }

    // Implementation of Identifiable interface
    @Override
    public void displayId() {
        System.out.println("Student ID: " + studentId);
    }
}