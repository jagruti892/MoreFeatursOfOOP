// Generates reports for DCST members
public class ReportManager {

    // Report for a student
    public void generateReport(Student student) {

        System.out.println("Student Report:");
        student.displayStudent();
    }

    // Overloaded method for teaching staff
    public void generateReport(TeachingStaff staff) {

        System.out.println("Teaching Staff Report:");
        staff.displayBasicDetails();
        staff.displayRole();
    }
}