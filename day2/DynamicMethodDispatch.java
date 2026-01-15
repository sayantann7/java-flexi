public class DynamicMethodDispatch {
    public static void main(String args[]){
        Computer obj = new Computer();
        obj.run();

        obj = new Laptop();
        obj.run();

        obj = new Tablet();
        obj.run();
    }   
}

class Computer{
    public Computer(){
        System.out.println("Computer Constructor called");
    }
    public void run(){
        System.out.println("Computer is running!");
    }
}

class Laptop extends Computer{
    public Laptop(){
        System.out.println("Laptop Constructor called");
    }
    public void run(int a){
        System.out.println("Value of argument is "+a);
        System.out.println("Laptop is running!");
    }
}

class Tablet extends Laptop{
    public Tablet(){
        System.out.println("Tablet Constructor called");
    }
    public void run(){
        System.out.println("Tablet is running!");
    }
}