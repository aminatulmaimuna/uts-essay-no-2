
public abstract class Notification implements Notifier {
    protected String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }

    public abstract void validateRecipient();
}
