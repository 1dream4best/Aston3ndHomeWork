public class BasicNotification implements Notification{
    //Decorator
    @Override
    public void send(String message){
        System.out.println("Надоедливое уведомление: " + message); 
    }
}
