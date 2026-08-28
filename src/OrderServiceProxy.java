public class OrderServiceProxy implements OrderService{
    //Proxy
    private final OrderService orderService;
    private final boolean authorized;

    public OrderServiceProxy(OrderService orderService, boolean authorized) {
        this.orderService = orderService;
        this.authorized = authorized;
    }

    @Override
    public void showOrder(Order order) {

        if (!authorized) {
            System.out.println("Нет доступа, вы здесь - никто!");
            return;
        }

        orderService.showOrder(order);
    }
}
