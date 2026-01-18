@FunctionalInterface
interface A{
    void show(int a);
}

public class Lambda {
    public static void main(String[] args) {
        A obj = (int a) -> System.out.println("in show "+a);
        obj.show(5);
    }
}
