
public class SMSNotification extends Notification {

    public SMSNotification(String recipient) {
        super(recipient);
    }

    @Override
    public void validateRecipient() {
        if (!recipient.matches("\\d{10,15}")) {
            throw new IllegalArgumentException("Nomor telepon tidak valid.");
        }
    }

    
    public void send(String message) {
        validateRecipient();
        System.out.println("Mengirim SMS ke " + recipient + ": " + message);
    }
}
