package shoppingOnline;


public class PurchaseDto {
    public User user;
    public boolean isPurchased;

    public PurchaseDto(User user, boolean isPurchased) {
        this.user = user;
        this.isPurchased = isPurchased;
    }

    public User getUser() {
        return user;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    @Override
    public String toString() {
        return "PurchaseDto{" +
                "user=" + user +
                ", isPurchased=" + isPurchased +
                '}';
    }
}
