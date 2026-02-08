import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products = new ArrayList<>();
    
    static int noOfProducts = 0;

    public void addProduct(Product product){
        products.add(product);
        noOfProducts++;
    }

    public void removeProduct(String productName){
        Product productToRemove = null;
        for(Product product : products){
            if(product.name.equals(productName)){
                productToRemove = product;
            }
        }
        if(productToRemove==null){
            System.out.println("Cannot remove the Product, it is not in the cart");
        }
        else{
            products.remove(productToRemove);
            System.out.println("Product removed from cart!");
            noOfProducts--;
        }
    }

    public double calculateTotalCost(){
        double totalCost = 0.0;
        for(Product product : products){
            totalCost += product.price;
        }
        return totalCost;
    }

    public void displayCart(){
        if(noOfProducts==0){
            System.out.println("No products in cart!");
        }
        else{
            System.out.println("All products in cart :");
            for(Product product : products){
                System.out.println("NAME : "+product.name);
                System.out.println("PRICE : "+product.price);
            }
        }
    }
}
