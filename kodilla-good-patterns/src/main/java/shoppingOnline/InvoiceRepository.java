package shoppingOnline;


import java.time.LocalDateTime;

public interface InvoiceRepository {
    void createInvoice(User user, Product productName, LocalDateTime purchaseDate);
}
