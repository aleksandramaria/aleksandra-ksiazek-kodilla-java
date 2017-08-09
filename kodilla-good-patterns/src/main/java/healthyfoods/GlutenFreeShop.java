package healthyfoods;


import java.util.List;

public class GlutenFreeShop implements Producer {
    private List<Product> products;

    public GlutenFreeShop(List<Product> products) {
        this.products = products;
    }
    @Override
    public void process(Product product) {
        System.out.println("Process GlutenFree for product: " + product.getProductName());
    }
}
