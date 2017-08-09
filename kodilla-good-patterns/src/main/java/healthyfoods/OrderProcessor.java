package healthyfoods;


public class OrderProcessor {

    private Producer producer;

    public OrderProcessor(Producer producer) {
        this.producer = producer;
    }

    public OrderItem process(OrderItem orderItem) {
        producer.process(orderItem.getProduct());
        orderItem.setSent(true);
        return orderItem;
    }
}
