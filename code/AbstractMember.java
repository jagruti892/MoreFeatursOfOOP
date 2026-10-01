// Abstract class representing a DCST member
public abstract class AbstractMember {

    protected int memberId;
    protected String name;

    // Constructor to initialize common member data
    public AbstractMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Abstract method
    public abstract void displayRole();

    // Displays common member details
    public void displayBasicDetails() {

        System.out.println("Member ID : " + memberId);
        System.out.println("Name      : " + name);
    }
}