public class CreditCardPayment extends Payment {
    public void processPayment(){
        int finalAmt = super.getAmount() * 1.02;
        super.setAmount(finalAmt);
        System.out.println("Credit Card : Processing payment of "+finalAmt);
    }
}
