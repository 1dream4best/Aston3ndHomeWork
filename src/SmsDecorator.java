public class SmsDecorator implements Notification{
    //Decorator
    private final Notification notification;

    public SmsDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);

        System.out.println("Отправили мем по SMS!");
    }
}
