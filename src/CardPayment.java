public class CardPayment implements PaymentStrategy {
    //Strategy
    @Override
    public void pay(double amount) {
        System.out.println("Оплата цифровым рублем: " + amount + " руб.");
    }
}
