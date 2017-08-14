package com.kodilla.good.patterns.healthyfoods;


import java.util.List;

public class ExtraFoodShop implements Producer {

    private List<Product> products;

    public ExtraFoodShop(List<Product> products) {
        this.products = products;
    }

    @Override
    public void process(Product product) {
        System.out.println("Process ExtraFood for product: " + product.getProductName());
    }
}
