public class MessageUpdater implements Observer {
    @Override 
    public void update(Message m){
        System.out.println(m.getMessageContent());
    }
}