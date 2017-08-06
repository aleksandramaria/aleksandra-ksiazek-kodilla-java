package shoppingOnline;

import java.time.LocalDateTime;

public class ProductOrderService {
    public boolean purchase(final User user, final Product product, final LocalDateTime dateOfPurchase) {
        System.out.println("Purchase successful: " + user.getName() + " " + product.getName() + " " + dateOfPurchase.toString());return true;
    }
}
