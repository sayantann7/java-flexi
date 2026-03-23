public class PaymentProcessor{
    Payment payment[];

    Payment p;

    public void processThroughUPI(){
        p = new UPIPayment();
        p.setAmount(1000);
        p.setTransactionId("42385HTJFGMF");
        payment[0] = p;
        p.processPayment();
    }

    public void processThroughCreditCard(){
        p = new CreditCardPayment();
        p.setAmount(1000);
        p.setTransactionId("FNSDGERE4547867");
        payment[1] = p;
        p.processPayment();
    }

    public void processBothMethod(){
        int sum = 0;
        for(Payment pay : payment){
            sum += pay.getAmount();
        }
        System.out.println("Total Payment : ");
        System.out.println(sum);
    }
}