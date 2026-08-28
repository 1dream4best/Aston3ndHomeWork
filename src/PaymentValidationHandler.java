public class PaymentValidationHandler extends OrderHandler {
    //Chain
    @Override
    protected boolean check(Order order) {
        if (order.getPaymentMethod() == null || order.getPaymentMethod().isBlank()) {
            System.out.println("Ошибка, а оплатить?");
            return false;
        }

        System.out.println("Способ оплаты прошел проверку!");
        return true;
    }
}
