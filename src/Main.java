public class Main {
    public static void main(String[] args) {

        //Builder
        Order order = createOrder();

        demonstrateStrategy(order);
        demonstrateChain(order);
        demonstrateProxy(order);
        demonstrateDecorator(order);
        demonstrateAdapter(order);
    }

    private static Order createOrder() {
        return new Order.Builder()
                .setId(1)
                .setProduct("Компухтер")
                .setPrice(150000)
                .setCustomer("Иваныч")
                .setPaymentMethod("Карта")
                .build();
    }

    private static void demonstrateStrategy(Order order) {
        System.out.println("\n--- Strategy ---");

        PaymentStrategy cardPayment = new CardPayment();
        cardPayment.pay(order.getPrice());

        PaymentStrategy cashPayment = new CashPayment();
        cashPayment.pay(order.getPrice());
    }

    private static void demonstrateChain(Order order) {
        System.out.println("\n--- Chain of Responsibility ---");

        OrderHandler validation = new OrderValidationHandler();
        OrderHandler paymentValidation = new PaymentValidationHandler();

        validation.setNext(paymentValidation);

        validation.handle(order);
    }

    private static void demonstrateProxy(Order order) {
        System.out.println("\n--- Proxy ---");

        OrderService realService = new RealOrderService();
        OrderService proxy = new OrderServiceProxy(realService, true);

        proxy.showOrder(order);
    }

    private static void demonstrateDecorator(Order order) {
        System.out.println("\n--- Decorator ---");

        Notification notification = new BasicNotification();
        notification = new EmailDecorator(notification);
        notification = new SmsDecorator(notification);

        notification.send("Заказ №" + order.getId() + " оформлен");
    }

    private static void demonstrateAdapter(Order order) {
        System.out.println("\n--- Adapter ---");

        OldPaymentSystem oldPaymentSystem = new OldPaymentSystem();

        PaymentStrategy adapter = new PaymentAdapter(oldPaymentSystem);

        adapter.pay(order.getPrice());
    }
}
