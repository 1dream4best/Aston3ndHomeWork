public class CashPayment implements PaymentStrategy {
    //Strategy
    @Override
    public void pay(double amount) {
        System.out.println("Оплата капустой: " + amount + " руб.");
    }
}
