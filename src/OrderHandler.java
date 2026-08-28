public abstract class OrderHandler {
    //Chain
    private OrderHandler next;

    public OrderHandler setNext(OrderHandler next){
        this.next = next;
        return next;
    }

    public void handle(Order order){
        if(check(order) && next != null){
            next.handle(order);
        }
    }

    protected abstract boolean check(Order order);
}
