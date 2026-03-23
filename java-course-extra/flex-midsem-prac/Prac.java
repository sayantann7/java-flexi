public class Prac{
    public static void main(String[] args) {
        Computer comp = new Desktop();
        System.out.println(Computer.x);
        System.out.println(Desktop.x);
        System.out.println(Laptop.x);
        comp.code();
    }
}

abstract class Computer{
    public Computer(String name){
        System.out.println("Created a "+name);
    }
    static int x = 1;
    abstract public void code();
}

class Desktop extends Computer{
    public Desktop(){
        super("Desktop");
    }
    static int x = 2;
    @Override
    public void code(){
        System.out.println("Coding in a Desktop "+x);
    }
}

class Laptop extends Computer{
    public Laptop(){
        super("Laptop");
    }
    @Override
    public void code(){
        System.out.println("Coding in a Laptop "+x);
    }
}