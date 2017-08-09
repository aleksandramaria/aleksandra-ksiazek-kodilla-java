package healthyfoods;


import java.util.List;

public class HealthyShop implements Producer {
    private List<Product> products;

    public HealthyShop(List<Product> products) {
        this.products = products;
    }
    @Override
    public void process(Product product) {
        System.out.println("Process Healthy for product: " + product.getProductName());

    }
}
