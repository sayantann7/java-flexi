import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Shopping Cart System!");
        int exit = 0;

        while(exit==0){
            System.out.println("What do you want to do?");
            System.out.println("Option 1 : Display all products");
            System.out.println("Option 2 : Add a product");
            System.out.println("Option 3 : Calculate total cost of cart");
            System.out.println("Option 4 : Exit the system");
            System.out.print("Enter your option (1/2/3/4) : ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch(choice){
                case 1:
                    shoppingCart.displayCart();

                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter product name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter product price : ");
                    double price = Double.parseDouble(sc.nextLine());
                    
                    Product product = new Product(name,price);
                    shoppingCart.addProduct(product);
                    System.out.println("The new product has been added!");

                    System.out.println();
                    break;
                case 3:
                    double totalCost = shoppingCart.calculateTotalCost();
                    System.out.println("Total Cost : "+totalCost);
                    break;
                case 4:
                    exit = 1;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
}
