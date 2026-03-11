package loose_coupling;

public class Main {
    public static void main(String[] args) {
        Send sms = new SmsService();
        Send email = new EmailService();
        Client client = new Client(sms);
        Client client1 = new Client(email);
        client.processMessage("Hello Thang \n");
        client1.processMessage("halllu");
    }
}
