
// Represents a student record used for NIRF data
import java.io.Serializable;
import java.util.ArrayList;

public class StudentRecord implements Serializable, Cloneable {

    private int studentId;
    private String studentName;
    private String program;
    private ArrayList<String> activities;

    // Constructor
    public StudentRecord(
            int studentId,
            String studentName,
            String program,
            ArrayList<String> activities) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.program = program;
        this.activities = activities;
    }

    // Displays student record
    public void displayRecord() {

        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + studentName);
        System.out.println("Program    : " + program);
        System.out.println("Activities : " + activities);
    }

    // Adds an activity to the student record
    public void addActivity(String activity) {
        activities.add(activity);
    }

    // Shallow copy
    public StudentRecord shallowClone()
            throws CloneNotSupportedException {

        return (StudentRecord) super.clone();
    }

    // Deep copy
    public StudentRecord deepClone() {

        ArrayList<String> copiedActivities = new ArrayList<>(activities);

        return new StudentRecord(
                studentId,
                studentName,
                program,
                copiedActivities);
    }
}