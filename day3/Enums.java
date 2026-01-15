enum Laptop{
    Macbook(2000), ThinkPad(1200), XPS(2200);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

public class Enums {
    public static void main(String[] args) {
        // Laptop lappy = Laptop.Macbook;
        // System.out.println(lappy.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}
