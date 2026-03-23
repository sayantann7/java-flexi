import java.util.HashMap;
import java.util.Map;

public class Inventory {
    HashMap<String, Item> items = new HashMap<>();

    public HashMap<String, Item> addItem(Item item){
        items.put(item.itemID, item);
        return items;
    }

    public HashMap<String, Item> removeITem(Item item){
        items.remove(item.itemID);
        return items;
    }

    public void displayAllItems(){
        for (Map.Entry<String, Item> entry : items.entrySet()) {
            String itemID = entry.getKey();
            Item item = entry.getValue();
            System.out.println(itemID+" : "+item);
        }
    }

    public Item searchItem(String itemID){
        for (Map.Entry<String, Item> entry : items.entrySet()) {
            String id = entry.getKey();
            if(itemID.equals(id)){
                return entry.getValue();
            }
        }
        return null;
    }

    public double calculateTotalValue(){
        double totalValue = 0;
        for (Map.Entry<String, Item> entry : items.entrySet()) {
            Item item = entry.getValue();
            totalValue += item.basePrice + item.tax();
        }
        return totalValue;
    }
}
