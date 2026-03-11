package loose_coupling;

public class EmailService implements Send {
    @Override
    public void sendMessage(String message){
        System.out.printf("Send email: %s", message);
    }
}
