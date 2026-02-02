final class MyClass{
    void display(){
        System.out.println("This is a final class");
    }
}

public class FinalClass{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}