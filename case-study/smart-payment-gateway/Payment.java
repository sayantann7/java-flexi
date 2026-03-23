abstract public class Payment {
    private String transactionId;
    private int amount;

    abstract public void processPayment();

    public String getTransactionId(){
        return transactionId;
    }

    public int getAmount(){
        return amount;
    }

    public void setTransactionId(String transactionId){
        if(transactionId.length()<10){
            System.out.println("Transaction ID must be atleast 10 characters long");
            return;
        }
        this.transactionId = transactionId;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
}
