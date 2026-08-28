public class EmailDecorator implements Notification{
    //Decorator
    private final Notification notification;

    public EmailDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);

        System.out.println("Отправили вам на почту любимый спам!");
    }
}
