package loose_coupling;

public class SmsService implements Send {
    @Override
    public void sendMessage(String message){
        System.out.printf("Send sms: %s", message);
    }
}
