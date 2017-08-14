package com.kodilla.good.patterns.healthyfoods;


public final class Product {
    private final String productName;
    private final double productPrice;


    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}