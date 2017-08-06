package shoppingOnline;


import java.time.LocalDateTime;

public class PurchaseRequest {
    public User user;
    public Product productName;
    public LocalDateTime purchaseDate;

    public PurchaseRequest(User user, Product productName, LocalDateTime purchaseDate) {
        this.user = user;
        this.productName = productName;
        this.purchaseDate = purchaseDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProductName() {
        return productName;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    @Override
    public String toString() {
        return "PurchaseRequest{" +
                "user=" + user +
                ", productName=" + productName +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}
