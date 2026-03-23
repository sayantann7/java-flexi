public class Prac7 {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.commonMethod();
    }
}

interface A{
    void methodA();
}

interface B extends A{
    void commonMethod();
}

interface C extends A{
    void commonMethod();
}

class D implements B,C{
    public void methodA(){
        System.out.println("method A");
    }
    public void commonMethod(){
        System.out.println("common method");
    }
}