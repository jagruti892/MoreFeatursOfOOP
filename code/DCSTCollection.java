// Generic class for storing DCST data
public class DCSTCollection<T> {

    private T data;

    // Constructor
    public DCSTCollection(T data) {
        this.data = data;
    }

    // Display stored data
    public void displayData() {

        if (data instanceof Student) {

            Student student = (Student) data;

            System.out.println("Student stored in generic class:");
            student.displayStudent();

        } else {
            System.out.println("Generic Data: " + data);
        }
    }
}