package shoppingOnline;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {
    public PurchaseRequest retrieve(){
        User user = new User("Adam Smith");
        Product product = new Product("Banksy artwork: umbrella girl");
        LocalDateTime dateOfPurchase = LocalDateTime.of(2016, 7, 12, 12, 0);

        return new PurchaseRequest(user, product, dateOfPurchase);
    }
}
