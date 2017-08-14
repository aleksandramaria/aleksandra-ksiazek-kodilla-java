package com.kodilla.good.patterns.healthyfoods;


import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws java.lang.Exception {

        List<Product> theList = new ArrayList<>();
        theList.add(new Product("eggs", 5));
        theList.add(new Product("millet", 9));
        theList.add(new Product("sunflower seeds", 7));
        theList.add(new Product("linseed oil", 2.5));

        OrderItem orderItem = new OrderItem(new Product("organic berries", 4), 10);

        HealthyShop healthyShop = new HealthyShop(theList);
        OrderProcessor orderProcessor = new OrderProcessor(healthyShop);
        orderProcessor.process(orderItem);
        System.out.println("the total of the order is " + orderItem.getValue() + " zloty");
    }
}

