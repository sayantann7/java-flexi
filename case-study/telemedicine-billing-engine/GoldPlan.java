public class GoldPlan extends Plan {
    public void calculateBill(){
        double totalAmt = super.getBaseFee()*1.1 - 20;
        System.out.println("Bill : "+totalAmt);
    }
}
