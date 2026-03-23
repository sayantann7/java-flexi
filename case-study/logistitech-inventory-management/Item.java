public abstract class Item{
    String itemID;
    String name;
    int basePrice;

    public void setItemID(String itemID){
        this.itemID = itemID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBasePrice(int basePrice){
        this.basePrice = basePrice;
    }

    abstract public double tax();

    @Override
    public String toString() {
        String obj = "Item{ name="+name+", basePrice="+basePrice+"}";
        return obj;
    }
    
}