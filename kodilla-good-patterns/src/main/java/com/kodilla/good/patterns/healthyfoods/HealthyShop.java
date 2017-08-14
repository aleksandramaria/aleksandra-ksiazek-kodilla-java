package com.kodilla.good.patterns.healthyfoods;


import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producer {
    private List<Product> products = new ArrayList<>();

    public HealthyShop(List<Product> products) {
        this.products = products;
    }
    @Override
    public void process(Product product) {
        System.out.println("Process HealthyShop for product: " + product.getProductName());

    }
}
