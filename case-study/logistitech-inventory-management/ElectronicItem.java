public class ElectronicItem extends Item {
    String warrantyPeriod;

    public void setWarrantyPeriod(String warrantyPeriod){
        this.warrantyPeriod = warrantyPeriod;
    }

    public double tax(){
        Taxable taxable = new ElectronicTaxable();
        return taxable.calculateTax(this);
    }
}
