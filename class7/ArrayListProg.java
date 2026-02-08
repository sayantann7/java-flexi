import java.util.ArrayList;

public class ArrayListProg{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("Fruits = "+fruits);
        fruits.remove("Banana");
        System.out.println("After removing banana : "+fruits);
        System.out.println("Size: "+fruits.size());
        System.out.println("Contains apple? "+fruits.contains("Apple"));
    }
}