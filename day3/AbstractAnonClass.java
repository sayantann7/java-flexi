abstract class A{
    public abstract void config();
}

public class AbstractAnonClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void config(){
                System.out.println("in config...");
            }
        };
        // An anonymous class is a class which basically inherits the parent class but it runs only once and you dont actually create a separate class for it...
        // This is helpful for Abstract class because it does not require us to create a separate subclass of the abstract class
        obj.config();
    }
}
