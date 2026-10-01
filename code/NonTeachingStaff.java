// Represents non-teaching staff at DCST
public class NonTeachingStaff extends AbstractMember
        implements ActivityParticipant {

    private String department;

    // Constructor to initialize non-teaching staff data
    public NonTeachingStaff(int memberId, String name, String department) {
        super(memberId, name);
        this.department = department;
    }

    // Different implementation for non-teaching staff
    @Override
    public void displayRole() {

        System.out.println("Role       : Non-Teaching Staff");
        System.out.println("Department : " + department);
    }

    // Interface method
    @Override
    public void participateInActivity() {

        System.out.println(
                name + " supports non-academic activities.");
    }
}