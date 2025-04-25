public class EmailNotification extends Notification {

    public EmailNotification(String recipient) {
        super(recipient);
    }

    public void validateRecipient() {
        if (!recipient.contains("@")) {
            throw new IllegalArgumentException("Alamat email tidak valid.");
        }
    }

    
    public void send(String message) {
        validateRecipient();
        System.out.println("Mengirim Email ke " + recipient + ": " + message);
    }
}
