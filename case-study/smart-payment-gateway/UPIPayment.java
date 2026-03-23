public class UPIPayment extends Payment {
    public void processPayment(){
        int finalAmt = super.getAmount();
        super.setAmount(finalAmt);
        System.out.println("UPI : Processing payment of "+finalAmt);
    }
}
