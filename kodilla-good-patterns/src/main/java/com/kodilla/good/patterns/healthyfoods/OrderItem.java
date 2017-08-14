package com.kodilla.good.patterns.healthyfoods;


public final class OrderItem {
    private final Product product;
    private final double quantity;
    private boolean isSent;

    public OrderItem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
        this.isSent = false;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return product.getProductPrice() * quantity;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }
}