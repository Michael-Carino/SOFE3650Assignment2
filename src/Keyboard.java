public class Keyboard {

    private CashRegister cashRegister = new CashRegister();

    public void setUPCCode(int upcCode){
    this.cashRegister.setCurrentProductUPC(upcCode);
}
}
