public class CashRegister {
    private TicketPrinter ticketPrinter = new TicketPrinter();
    private Product currentProduct;
    private ProductDB productDB = new ProductDB();
    private int upcCode;

    public void setCurrentProductUPC(int upcCode) {
        this.upcCode = upcCode;
        this.currentProduct = this.getCurrentProductInfo();


        if (this.currentProduct != null){

            
            this.ticketPrinter.displayText(this.currentProduct.toString());
        }
    }
    public Product getCurrentProductInfo() {
        currentProduct = this.productDB.GetProductInfo(this.upcCode);
        return currentProduct;
    }
}