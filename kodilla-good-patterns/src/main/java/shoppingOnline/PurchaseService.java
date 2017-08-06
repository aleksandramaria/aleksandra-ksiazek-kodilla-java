package shoppingOnline;


import java.time.LocalDateTime;

public interface PurchaseService {
    boolean purchase(User user, Product product, LocalDateTime dateOfPurchase);
}
