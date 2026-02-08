class Payment{
    public void pay(String cardNo, int cvv){
        System.out.println("Paying through Credit Card");
    }
    public void pay(String accountNo, String ifscCode){
        System.out.println("Paying through Bank Transfer");
    }
    public void pay(String upiID){
        System.out.println("Paying through UPI");
    }
}

public class PaymentSystem{
    public static void main(String[] args) {
        Payment obj = new Payment();
        obj.pay("8404920213@ybl");
        obj.pay("4238-0842-8502-8554-8523",688);
        obj.pay("84235235823853523","FJFNENGNWE4235236");
    }
}