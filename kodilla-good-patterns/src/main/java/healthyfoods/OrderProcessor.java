package healthyfoods;


public class OrderProcessor {

    private Producer producer;

    public OrderProcessor(Producer producer) {
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
    }
}
