public class PerishableTaxable implements Taxable {
    public double calculateTax(Item item){
        double tax = item.basePrice*0.05;
        return tax;
    }
}
