public class SilverPlan extends Plan {
    public void calculateBill(){
        int totalAmt = super.getBaseFee() + 15;
        System.out.println("Bill : "+totalAmt);
    }
}
