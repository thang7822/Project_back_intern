package loose_coupling;

public class Client {
    private Send send;

    public Client(Send send){
        this.send = send;
    }

    public void processMessage(String message){
        send.sendMessage(message);
    }
}
