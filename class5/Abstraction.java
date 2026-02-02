abstract class Shape{
    abstract void show();

    void message(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    void show(){
        System.out.println("This is a circle");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.show();
        s.message();
    }
}