package healthyfoods;


import shoppingOnline.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
//
//public class Application {
//
//    public static void main(String[] args) throws java.lang.Exception {

//        List<Product> products = new ArrayList<>();
//        Product product1 = new Product("organic eggs", 2);
//        Product product2 = new Product("organic flour", 3);
//        Product product3 = new Product("organic berries", 4);

//        List<OrderItem> orderItemList = new ArrayList<>();
//        orderItemList.add(new OrderItem(new Product("organic eggs", 2), 10));
//        orderItemList.add(new OrderItem(new Product("organic flour", 3), 5));
//        OrderItem orderItem = new OrderItem(new Product("organic berries", 4), 10);

//        HealthyShop healthyShop = new HealthyShop(this.products);
//        OrderProcessor orderProcessor = new OrderProcessor(product -> product.getProductName());
//        orderProcessor.process(orderItem);
//        healthyShop.process(orderItem.getProduct());
//    }
//}


//    public OrderItem process(OrderItem orderItem) {
//        producer.process(orderItem.getProduct());
//        orderItem.setSent(true);
//        return orderItem;
//    }

//    public static void main(String[] args) {
//        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
//        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();
//
//        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new MailService(), new ProductPurchaseService(),
//                new ProductInvoiceRepository());
//
//        purchaseProcessor.process(purchaseRequest);
//        //PurchaseDto purchaseDto = new PurchaseDto(new User ("Adam Smith"), false);
//
//        String result = purchaseRequest.toString();
//        //String result1 = purchaseDto.toString();
//        System.out.println(result);
//        //System.out.println(result1);
//    }

//
//    Product product1 = new Product("organic eggs", 2);
//    Product product2 = new Product("organic flour", 3);
//    Product product3 = new Product("organic berries", 4);