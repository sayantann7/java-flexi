class Computer{
    String name;
    public Computer(String name){
        this.name = name;
    }
    public void startComputer(){
        System.out.println("Computer "+this.name+" has started");
    }
}

class Laptop extends Computer{
    String touchpad;
    String name = "Acer";
    public Laptop(String name, String touchpad){
        super(name);
        this.touchpad = touchpad;
    }
    public void workWithTouchpad(){
        super.startComputer();
        System.out.println("Touchpad is now working!");
    }
}

public class Prog1{
    public static void main(String[] args) {
        Laptop lappy = new Laptop("Lenovo", "myTouchpad");
        lappy.workWithTouchpad();
        System.out.println("The name of the computer is "+lappy.name);
    }
}