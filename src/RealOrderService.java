public class RealOrderService implements OrderService {
    //proxy
    @Override
    public void showOrder(Order order){
        System.out.println("Заказ: " + order);
    }
}
