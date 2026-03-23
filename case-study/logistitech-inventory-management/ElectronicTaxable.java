public class ElectronicTaxable implements Taxable {
    public double calculateTax(Item item){
        double tax = item.basePrice*0.15;
        return tax;
    }
}