package shoppingOnline;


public class Application {
    public static void main(String[] args) {
        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new MailService(), new ProductPurchaseService(),
                new ProductInvoiceRepository());

        purchaseProcessor.process(purchaseRequest);
        //PurchaseDto purchaseDto = new PurchaseDto(new User ("Adam Smith"), false);

        String result = purchaseRequest.toString();
        //String result1 = purchaseDto.toString();
        System.out.println(result);
        //System.out.println(result1);
    }
}



