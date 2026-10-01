// Validates student data for the DCST system
public class StudentValidator {

    public void validateStudent(
            int studentId,
            String name,
            String program)
            throws InvalidStudentDataException {

        if (studentId <= 0) {
            throw new InvalidStudentDataException(
                    "Invalid student ID: " + studentId);
        }

        if (name == null || name.isEmpty()) {
            throw new InvalidStudentDataException(
                    "Student name cannot be empty.");
        }

        if (program == null || program.isEmpty()) {
            throw new InvalidStudentDataException(
                    "Program cannot be empty.");
        }

        System.out.println(
                "Valid student data: "
                        + studentId + " - "
                        + name + " - "
                        + program);
    }
}