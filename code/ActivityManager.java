// Handles DCST activity participation
public class ActivityManager {

    // Accepts any object that implements ActivityParticipant
    public void registerParticipant(ActivityParticipant participant) {

        // Message is passed to the object
        participant.participateInActivity();
    }
}