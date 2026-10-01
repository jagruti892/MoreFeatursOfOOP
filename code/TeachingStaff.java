// Represents teaching staff at DCST
public class TeachingStaff extends AbstractMember
        implements ActivityParticipant {

    private String subject;

    // Constructor to initialize teaching staff data
    public TeachingStaff(int memberId, String name, String subject) {
        super(memberId, name);
        this.subject = subject;
    }

    // Different implementation for teaching staff
    @Override
    public void displayRole() {

        System.out.println("Role    : Teaching Staff");
        System.out.println("Subject : " + subject);
    }

    // Interface method
    @Override
    public void participateInActivity() {

        System.out.println(
                name + " participates in academic activities.");
    }
}