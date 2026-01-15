interface A{
    int age = 20;
    String name = "Sayantan"; // by default these are final static

    void show();
    void config(); // by default they are public abstract
}

interface B extends A{
    void func();
}

interface C{
    void foo();
}

class D implements A, C{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void foo(){
        System.out.println("in foo");
    }
}

class Interfaces{
    public static void main(String[] args) {
        A obj;
        obj = new D();
        obj.show();
        obj.config();

        System.out.println(obj.age); // better way to use is A.age as it is a static variable
        // obj.age = 13; --> this is not possible
    }
}