package shoppingOnline;

public class PurchaseProcessor {

    private InformationService informationService;
    private PurchaseService purchaseService;
    private InvoiceRepository invoiceRepository;

    public PurchaseProcessor(final InformationService informationService,
                           final PurchaseService purchaseService,
                           final InvoiceRepository invoiceRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.invoiceRepository = invoiceRepository;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    public PurchaseService getPurchaseService() {
        return purchaseService;
    }

    public InvoiceRepository getInvoiceRepository() {
        return invoiceRepository;
    }

    public PurchaseDto process(final PurchaseRequest purchaseRequest) {
        boolean isPurchased = purchaseService.purchase(purchaseRequest.getUser(), purchaseRequest.getProductName(),
                purchaseRequest.getPurchaseDate());


        if(isPurchased) {
            informationService.inform(purchaseRequest.getUser());
            invoiceRepository.createInvoice(purchaseRequest.getUser(), purchaseRequest.getProductName(), purchaseRequest.getPurchaseDate());
            return new PurchaseDto(purchaseRequest.getUser(), true);
        } else {
            return new PurchaseDto(purchaseRequest.getUser(), false);
        }
    }
}