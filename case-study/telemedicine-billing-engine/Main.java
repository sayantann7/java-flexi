public class Main {
    
    public static void printInvoice(Plan p){
        p.calculateBill();
    }

    public static void main(String[] args) {
        Plan p = new GoldPlan();
        p.setPatientName("Sophia");
        p.setBaseFee(200);

        printInvoice(p);

        Plan p2 = new SilverPlan();
        p2.setPatientName("John");
        p2.setBaseFee(100);

        printInvoice(p2);
    }
}
