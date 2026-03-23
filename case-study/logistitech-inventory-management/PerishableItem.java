public class PerishableItem extends Item{
    ExpiryDate expiryDate;

    public void setExpiryDate(int day, int month, int year){
        expiryDate = new ExpiryDate(day, month, year);
    }

    public double tax(){
        Taxable taxable = new PerishableTaxable();
        return taxable.calculateTax(this);
    }
}
