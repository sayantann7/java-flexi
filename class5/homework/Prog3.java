// write a program in java to implement interface to solve the diamonnd  problem

interface UpperClass{
    void parentMethod();
}

interface ClassA extends UpperClass{
    void display();
    void run();
}

interface ClassB extends UpperClass{
    void message();
    void display();
}

class Child implements ClassA, ClassB{
    public void display(){
        System.out.println("display");
    }
    public void run(){
        System.out.println("run");
    }
    public void message(){
        System.out.println("message");
    }
    public void parentMethod(){
        System.out.println("Parent Method");
    }
}

public class Prog3{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.run();
        obj.message();
        obj.display();
        obj.parentMethod();
    }
}