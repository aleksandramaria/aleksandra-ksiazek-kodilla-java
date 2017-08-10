package healthyfoods;


import shoppingOnline.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws java.lang.Exception {

        List<Product> theList = new ArrayList<>();

        OrderItem orderItem = new OrderItem(new Product("organic berries", 4), 10);

        HealthyShop healthyShop = new HealthyShop(theList);
        healthyShop.process(orderItem.getProduct());
    }
}
