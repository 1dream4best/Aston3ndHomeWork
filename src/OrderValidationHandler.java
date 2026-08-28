public class OrderValidationHandler extends OrderHandler {
    //Chain
    @Override
    protected boolean check(Order order){
        if(order.getProduct() == null || order.getProduct().isBlank()){
            System.out.println("Вы ошибка, а где товар?");
            return false;
        }

        if (order.getPrice() <= 0) {
            System.out.println("Опять ошибка, товар не бесплатный!");
            return false;
        }

        if (order.getCustomer() == null || order.getCustomer().isBlank()) {
            System.out.println("Ошибка, кто здесь?");
            return false;
        }

        System.out.println("Заказ прошел проверку!");
        return true;
    }
}
